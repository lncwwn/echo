package cn.recursion.crawler.core;

import java.util.List;
import org.htmlparser.Parser;

/**
 * {@code HtmlParser} provides capabilities of parsing html content.
 *
 * @author victor.li
 * @date 3/7/15
 */
public interface HtmlParser<T> {

    /**
     * the {@code HtmlParser} needs an {@code Parser} as its engine
     * @param parser
     */
    public void init(Parser parser);

    public List<T> extractLinks();

}
