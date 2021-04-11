package inheritance;

import java.util.Scanner;

public class Review extends Restaurant{
    String body;
    String author;
    double votesGiven;

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public double getVotesGiven(){
        return votesGiven;
    }

    public void setVotesGiven(double votesGiven){
        this.votesGiven = votesGiven;
    }

    public Review(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your Name: ");
        this.author = input.next();
        System.out.println("Your Message or Feedback: ");
        this.body = input.next();
        while (votesGiven  > 5 || votesGiven < 0 ){
            System.out.println("Rating: ");
            votesGiven = input.nextInt();
        }
    }

    public Review( String author, double votesGiven,String body, String restaurantName, double votes){
        this.body = body;
        this.author = author;
        this.votesGiven= votesGiven;
        this.restaurantName = restaurantName;
        this.votes = votes;

    }
    public String toString(){
        String information = new String();
        information += "Name: " + author +
                "\nMessage: I voted for "+ restaurantName + " restaurant, and give it " + votesGiven + ", So it has now "+ votes + " stars. Wow!" ;
        return information;
    }
}
