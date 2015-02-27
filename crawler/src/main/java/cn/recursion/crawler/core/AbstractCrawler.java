package cn.recursion.crawler.core;

import cn.recursion.crawler.model.AbstractCrudeResource;
import cn.recursion.crawler.model.URI;

import java.io.IOException;

/**
 * {@code Crawler} provides the whole capabilities of fetching website on internet.
 *
 * @author victor li
 * @date 2/27/15
 */
public abstract class AbstractCrawler {

    /**
     * captures contents from the specified uri
     * @param uri string uri
     * @return the crude contents of the specified uri
     */
    public abstract AbstractCrudeResource capture(String uri) throws IOException;

    /**
     * captures contents from the specified uri
     * @param uri an instance of {@code URI}
     * @return the crude contents of the specified uri
     */
    public abstract AbstractCrudeResource capture(URI uri);
}
