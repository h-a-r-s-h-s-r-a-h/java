package book;

public class Bookrunner {
    public static void main(String[] args){
        Book book = new Book("12345","Java","Jai Shree Ram");
        book.addReview(new Review("12345", "best book ever", "10"));
        System.out.println(book);
    }
}
