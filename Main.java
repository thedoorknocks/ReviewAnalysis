public class Main {
    public static void main(String[] args) {
        Review[] reviews = {
            new Review(4, "Good! thx"),
            new Review(3, "OK site"),
            new Review(5, "Great!"),
            new Review(1, "Poor! Bad."),
            new Review(3, "")
        };

        ReviewAnalysis r = new ReviewAnalysis(reviews);
        System.out.println(r.getAverageRating());
        System.out.println(r.collectComments());
    }
}

