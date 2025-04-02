package oop.enums;

public class RatingBad {

    public static final RatingBad ZERO = new RatingBad("☆☆☆☆☆");
    public static final RatingBad ONE = new RatingBad("★☆☆☆☆");

    private final String stars;

    private RatingBad(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
