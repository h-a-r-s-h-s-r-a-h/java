package book;

public class Review {
    private String id;
    private String description;
    private String rating;

    Review(String id, String description,String rating){
        this.id = id;
        this.description = description;
        this.rating = rating;
    }
    public String toString(){
        return id + "," + description + "," + rating;
    }
}
