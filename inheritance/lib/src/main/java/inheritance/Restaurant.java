package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    String restaurantName;
    double votes;
    String currency;

    public List<Review> reviews;

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
        this.reviews = new ArrayList<>();
    }

    public String toString(){
        String information = new String();
        information += "Restaurant Name: " + restaurantName + "\nVotes: " + votes +
                "\nCurrency: " + currency + "\n" + reviews;
        System.out.println(information);
        return information;
    }

    public void addReview(String newReview, double newVotes, String message){
          Review review = new Review( newReview, newVotes, message);
          this.votes = this.votes + newVotes;
          this.reviews.add(review);
    }

 }
