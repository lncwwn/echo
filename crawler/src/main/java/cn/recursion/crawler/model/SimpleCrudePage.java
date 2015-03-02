package cn.recursion.crawler.model;

/**
 * The simple implementation of {@code AbstractCrudeResource},
 * only contains the necessary information without the whole DOM of crude resource.
 *
 * @author victor li
 * @date 2/11/15
 */
public class SimpleCrudePage extends CrudeResource {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
