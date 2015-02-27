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
    private Evaluation evaluation;

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

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

}
