package inheritance;

import java.util.Scanner;

public class Review {
    String body;
    String author;
    double votesGiven;

    public Review(){}

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

    public Review(String author, double votes, String message){
        this.author = author;
        this.body = message;
        this.votesGiven = votes;
    }

    public Review( String author, double votesGiven,String body, String restaurantName, double votes){
        this.body = body;
        this.author = author;
        this.votesGiven= votesGiven;
//        this.restaurantName = restaurantName;
//        this.votes = votes;

    }

    public String toString(){
        String information= "Review " +
                "Name: " + author + "\nRating: " + votesGiven + "\nMessage: " + body + ".";
        return information;
    }
}
