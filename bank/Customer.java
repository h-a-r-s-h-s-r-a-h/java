package bank;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    Customer(String name, Address homeaddress, Address workAddress){
        this.name = name;
        this.homeAddress = homeaddress;
        this.workAddress = workAddress;
    }

    public Address gethomeAddress(){
        return this.homeAddress;
    }
    public void sethomeAddress(Address new_home){
        this.homeAddress = new_home;
    }
    
    public Address getworkAddress(){
        return this.workAddress;
    }
    public void setworkAddress(Address new_work){
        this.workAddress = new_work;
    }
    
    public String toString(){
        return String.format("name :- [ %s ] , home :- [ %s ] , work :- [ %s ]", name, homeAddress,workAddress);
    }
}
