package class1.test;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movieReview0 = new MovieReview();
        movieReview0.title = "인셉션";
        movieReview0.review = "인생은 무한 루프";

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "어바웃 타임";
        movieReview1.review = "인생 시간 영화";

        MovieReview[] movieReviews = {movieReview0, movieReview1};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }

    }
}
