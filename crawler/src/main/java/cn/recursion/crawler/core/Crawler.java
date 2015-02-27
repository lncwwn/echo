package cn.recursion.crawler.core;

import cn.recursion.crawler.model.AbstractCrudeResource;
import cn.recursion.crawler.model.URI;

/**
 * {@code Crawler} provides the whole capabilities of fetching website on internet.
 *
 * @author victor li
 * @date 2/27/15
 */
public abstract class Crawler {

    /**
     * captures contents from the specified uri
     * @param uri
     * @return the crude contents of the specified uri
     */
    public abstract AbstractCrudeResource capture(String uri);

    /**
     * captures contents from the specified uri
     * @param uri
     * @return the crude contents of the specified uri
     */
    public AbstractCrudeResource capture(URI uri) {
        if (null == uri)
            return null;
        String s = uri.getUri();
        if (null == s || s.isEmpty())
            return null;
        return capture(s);
    }
}
