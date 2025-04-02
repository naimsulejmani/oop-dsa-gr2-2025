package oop.enums;

public enum Rating {
    ZERO("☆☆☆☆☆"),
    ONE("★☆☆☆☆"),
    TWO("★★☆☆☆"),
    THREE("★★★☆☆"),
    FOUR("★★★★☆"),
    FIVE("★★★★★");
    private final String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d)", stars, super.toString(), ordinal());
    }
}










