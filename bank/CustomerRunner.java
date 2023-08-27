package bank;

public class CustomerRunner {
    public static void main(String[] args){
        Address home = new Address("line1", "New York","12345");
        Address work = new Address("line3","Washington","67899");
        Customer harsh = new Customer("Harsh", home, work);
        System.out.println(harsh);
    }
    
}
