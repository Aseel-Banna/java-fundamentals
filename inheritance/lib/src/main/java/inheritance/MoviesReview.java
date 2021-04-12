package inheritance;

public class MoviesReview extends Review{
    private String movieName;

    public MoviesReview(String author,double stars,String movieName, String message){
        super(author,stars, message);
        this.movieName=movieName;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    @Override
    public String toString() {
        return "Review: " +
                "Name: " + super.getAuthor() + "\nRate: " + super.getVotesGiven() + "\nMovie Name: " + this.getMovieName() + ".";
    }
}
