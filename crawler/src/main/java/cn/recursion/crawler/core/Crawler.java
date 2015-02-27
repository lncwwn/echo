package cn.recursion.crawler.core;

import cn.recursion.crawler.model.AbstractCrudeResource;
import cn.recursion.crawler.model.URI;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * {@code ITCrawler} is a sub-class of {@code AbstractCrawler}, only capture websites
 * that related to IT.
 *
 * @author victor li
 * @date 2/27/15
 */
public class Crawler extends AbstractCrawler {

    private CloseableHttpClient httpClient;

    public Crawler() {
        if (null == httpClient)
            httpClient = HttpClients.createDefault();
    }

    @Override
    public AbstractCrudeResource capture(String uri) {
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
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
