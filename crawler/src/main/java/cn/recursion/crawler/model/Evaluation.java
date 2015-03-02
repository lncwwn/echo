package cn.recursion.crawler.model;

/**
 * Abstract evaluation of an URI.
 *
 * @author victor li
 * @date 2/12/15
 */
public abstract class Evaluation {

    // score of URI
    private Double score;

    /**
     * evaluates the final score of an URI,
     * according to concrete business
     */
    public abstract Double evaluate();

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
