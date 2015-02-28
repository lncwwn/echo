package cn.recursion.crawler;

import cn.recursion.crawler.core.impl.SimpleCrawler;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test {@code SimpleCrawler}
 *
 * @author victor li
 * @date 2/28/15
 */
public class SimpleCrawlerTest {

    private static SimpleCrawler crawler;

    @BeforeClass
    public static void init() {
        crawler = new SimpleCrawler();
    }

    @Test
    public void testCapture() {
        crawler.capture("http://www.itouxian.com");
    }

}
