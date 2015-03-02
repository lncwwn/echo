package cn.recursion.crawler.model;

/**
 * An implementation of {@code Evaluation} class,
 * this implementation cares about the <em>bid</em> element of an URI.
 *
 * @author victor li
 * @date 2/11/15
 */
public class BasicEvaluation extends Evaluation {

    private Double bid;

    @Override
    public Double evaluate() {
        // TODO
        return 10d;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

}
