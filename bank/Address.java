package bank;

public class Address {
    private String line;
    private String city;
    private String zip;

    Address(String line, String city, String zip){
        this.line = line;
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return String.format("line :- %s, city :- %s, zip :- %s",line,city,zip);
    }
    
}
