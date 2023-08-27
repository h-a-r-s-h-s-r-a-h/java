package book;

import java.util.ArrayList;

public class Book {
    private String id;
    private String name;
    private String author;
    private ArrayList<Review> review = new ArrayList<>();

    Book(String id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public void addReview(Review new_review){
        this.review.add(new_review);
    }

    public String toString(){
        return String.format("Book:- id-[%s],name-[%s],author-[%s] ,   rating-[%s]",id,name,author,review);
    }

    
}
