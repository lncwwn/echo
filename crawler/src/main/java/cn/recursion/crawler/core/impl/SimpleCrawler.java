package cn.recursion.crawler.core.impl;

import cn.recursion.crawler.core.Crawler;
import cn.recursion.crawler.model.AbstractCrudeResource;
import cn.recursion.crawler.model.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * {@code SimpleCrawler} implements {@code Crawler}
 *
 * @author victor li
 * @date 2/27/15
 */
public class SimpleCrawler implements Crawler {

    private Logger logger = LoggerFactory.getLogger(SimpleCrawler.class);

    private CloseableHttpClient httpClient;

    public SimpleCrawler() {
        if (null == httpClient)
            httpClient = HttpClients.createDefault();
    }

    @Override
    public AbstractCrudeResource capture(String uri) {
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            // code 200 OK
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                byte[] b = new byte[1024];
                entity.getContent().read(b);
                for (int i = 0; i < b.length; i++) {
                    System.out.println(new String(b));
                }
            } else if (statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {

            }
        } catch (IOException e) {
            logger.error("Exception occurred when executing " +
                    "get request by httpClient, the nested exception is ", e);
        } finally {
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    logger.error("Exception occurred when releasing " +
                            "connection, the nested exception is {}", e);
                }
            }
        }
        return null;
    }

    @Override
    public AbstractCrudeResource capture(URI uri) {
        return null;
    }

}
