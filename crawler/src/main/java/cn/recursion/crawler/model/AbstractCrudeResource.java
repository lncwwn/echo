package cn.recursion.crawler.model;

import java.util.Date;

/**
 * The abstract crude resource caught by crawler.
 *
 * @author victor li
 * @date 2/13/15
 */
public abstract class AbstractCrudeResource {

    private int id;
    private String title;
    private Date created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
