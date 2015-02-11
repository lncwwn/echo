package cn.recursion.crawler.model;

/**
 * Evaluation of an URI.
 *
 * @author victor li
 * @date 2/11/15
 */
public class Evaluation extends AbstractEvaluation {

    private Double bid;

    public Double evaluate() {
        return 10d;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

}
