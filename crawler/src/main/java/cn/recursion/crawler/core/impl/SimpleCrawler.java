package cn.recursion.crawler.core.impl;

import cn.recursion.crawler.core.Crawler;
import cn.recursion.crawler.model.AbstractCrudeResource;
import cn.recursion.crawler.model.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

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
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            BufferedInputStream bin = new BufferedInputStream(entity.getContent());
            System.out.println(bin.read());
            Header[] hs = response.getAllHeaders();
            for (Header h : hs) {
                System.out.print(h.getName() + ":");
                System.out.println(h.getValue());
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
