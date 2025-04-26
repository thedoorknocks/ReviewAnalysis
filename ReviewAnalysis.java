import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[]  reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double sum = 0;
        for (Review r : allReviews){
            sum = sum + r.getRating();
        }
        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<String>();
        for(int j = 0; j<allReviews.length; j++){
            for(int i = 0; i<allReviews[j].getComment().length(); i++){
                if(allReviews[j].getComment().substring(i,i+1).equals("!")){
                    comments.add(allReviews[j].getComment());                }
            }
        }
        return comments;
    }
}
