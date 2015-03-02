package cn.recursion.crawler.model;

import java.util.Date;

/**
 * The abstract crude resource caught by crawler.
 *
 * @author victor li
 * @date 2/13/15
 */
public abstract class CrudeResource {

    private int id;
    private String url;
    private String title;
    private Date created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
