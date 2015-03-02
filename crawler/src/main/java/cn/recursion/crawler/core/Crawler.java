package cn.recursion.crawler.core;

import cn.recursion.crawler.model.CrudeResource;
import cn.recursion.crawler.model.URI;

/**
 * {@code Crawler} provides capabilities of fetching website on internet.
 *
 * @author victor li
 * @date 2/27/15
 */
public interface Crawler {

    /**
     * captures contents from the specified uri
     * @param uri an instance of {@code URI}
     * @return the crude contents of the specified uri
     */
    public CrudeResource capture(URI uri);

}
