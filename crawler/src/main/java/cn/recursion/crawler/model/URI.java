package cn.recursion.crawler.model;

import java.io.Serializable;

/**
 * The target URI that will be fetched by the crawler.
 *
 * @author victor li
 * @date 2/11/15
 */
public class URI implements Serializable {

    private int id;
    private String uri;
    private BasicEvaluation evaluation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public BasicEvaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(BasicEvaluation evaluation) {
        this.evaluation = evaluation;
    }

}
