package cn.recursion.crawler.core.impl;

import cn.recursion.crawler.core.Crawler;
import cn.recursion.crawler.model.abs.CrudePage;
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

import java.io.IOException;
import java.io.InputStream;

/**
 * {@code BasicCrawler} implements {@code Crawler}
 *
 * @author victor li
 * @date 2/27/15
 */
public class BasicCrawler implements Crawler {

    private Logger logger = LoggerFactory.getLogger(BasicCrawler.class);

    private CloseableHttpClient httpClient;

    public BasicCrawler() {
        if (null == httpClient)
            httpClient = HttpClients.createDefault();
    }

    public CrudePage capture(String uri) {
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = null;
        InputStream in = null;
        try {
            response = httpClient.execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            // code 200 OK
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                byte[] bytes = new byte[1024];
                in = entity.getContent();
                StringBuilder sb = new StringBuilder();
                while (in.read(bytes) != -1) {
                    sb.append(new String(bytes));
                    bytes = new byte[1024];
                }
                in.close();
                System.out.println(sb.toString());
                // code 301 MOVED TEMPORARILY
            } else if (statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {
                // code 404 NOT FOUND
            } else if (statusCode == HttpStatus.SC_NOT_FOUND) {

            }
        } catch (IOException e) {
            logger.error("failed to execute the GET request by httpClient," +
                    " the nested exception is ", e);
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error("failed to release InputStream," +
                            " the nested exception is {}", e);
                }
            }
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    logger.error("failed to release http connection," +
                            " the nested exception is {}", e);
                }
            }
        }
        return null;
    }

    @Override
    public CrudePage capture(URI uri) {
        return null;
    }

    /**
     * parse response header
     * @param header
     */
    protected void parseHeader(Header header) {
        // TODO
    }

}
