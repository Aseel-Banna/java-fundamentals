package inheritance;

import java.util.ArrayList;

public class Shop {
    String shopName, description, currency;
    ArrayList<Review> reviews;

    public Shop(){}
    public Shop(String shopName, String description, String currency){
        this.shopName = shopName;
        this.description = description;
        this.currency = currency;
        this.reviews = new ArrayList<>();
    }

    public String getShopName(){
        return shopName;
    }
    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String toString(){
        String information = new String();
        information += "Shop Name: " + shopName +
                "\nDescription: "+ description + "\nCurrency: " + currency ;
        System.out.println(information);
        return information;
    }

    public void addReview (String newReview, double newVotes, String message){
        Review review = new Review( newReview, newVotes, message);
        this.reviews.add(review);
    }

}
