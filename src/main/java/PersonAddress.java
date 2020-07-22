public class PersonAddress {
    private String city;
    private String  state;
    private long zip;
    PersonAddress(){}
    PersonAddress(String city, String  state, long zip)
    {
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
    public void printAddress(){
        System.out.println("Address is:"+" "+city+" "+state+" "+zip);
    }
}
