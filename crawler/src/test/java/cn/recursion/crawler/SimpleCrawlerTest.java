package cn.recursion.crawler;

import cn.recursion.crawler.core.impl.BasicCrawler;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test {@code BasicCrawler}
 *
 * @author victor li
 * @date 2/28/15
 */
public class SimpleCrawlerTest {

    private static BasicCrawler crawler;

    @BeforeClass
    public static void init() {
        crawler = new BasicCrawler();
    }

    @Test
    public void testCapture() {
        crawler.capture("http://www.itouxian.com");
    }

}
