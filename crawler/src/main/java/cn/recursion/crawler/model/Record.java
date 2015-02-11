package cn.recursion.crawler.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Record is
 *
 * @author victor li
 * @date 2/11/15
 */
public class Record implements Serializable {

    private long id;
    private String title;
    private String score;
    private Date created;
    private Date updated;

    public Record() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return title;
    }

}
