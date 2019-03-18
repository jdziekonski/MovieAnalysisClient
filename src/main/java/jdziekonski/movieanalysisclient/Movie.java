package jdziekonski.movieanalysisclient;

public class Movie {
    private String title;
    private String director;
    private int positiveSentimentCounter;
    private int negativeSentimentCounter;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPositiveSentimentCounter() {
        return positiveSentimentCounter;
    }

    public void setPositiveSentimentCounter(int positiveSentimentCounter) {
        this.positiveSentimentCounter = positiveSentimentCounter;
    }

    public int getNegativeSentimentCounter() {
        return negativeSentimentCounter;
    }

    public void setNegativeSentimentCounter(int negativeSentimentCounter) {
        this.negativeSentimentCounter = negativeSentimentCounter;
    }
}