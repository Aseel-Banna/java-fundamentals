package inheritance;

import java.util.Scanner;

public class Restaurant {
    String restaurantName;
    double votes;
    String currency;

    Review review;


    public Restaurant(){}

    public String getRestaurantName(){
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public double getVotes(){
        return votes;
    }

    public void setVotes(double votes){
        this.votes = votes;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public Restaurant(String restaurantName, double votes, String currency ){
        this.restaurantName = restaurantName;
        Scanner input = new Scanner(System.in);
        while (votes  > 5 || votes < 0 ) {
            System.out.println("Insert vote from 0 - 5!");
            votes = input.nextInt();
        }
        this.votes = votes;
        this.currency= currency;
    }

    public String toString(){
        String information = new String();
        information += "Restaurant Name: " + restaurantName + "\nVotes: " + votes +
                "\nCurrency: " + currency;
        return information;
    }

    public void addReview(Review review){
        double totalVotes = this.getVotes() + review.votesGiven;
        review.setCurrency(this.getCurrency());
        review.setVotes(totalVotes);
        review.setRestaurantName(this.getRestaurantName());
        review.setAuthor(review.getAuthor());
        review.setBody(review.getBody());
        review.setVotesGiven(review.getVotesGiven());
        this.review = review;
    }

 }
