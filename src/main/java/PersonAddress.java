import javax.swing.*;

public class PersonAddress {
    private String city;
    private String state;
    private String zip;
    
    PersonAddress(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public void setCity(String cty){
        city=cty;
    }
    public void setState(String state1){
        state=state1;
    }
    public void setZip(String zp){
        zip=zp;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }

    public void printAddress(){
        JOptionPane.showMessageDialog(null,city+state+zip);
        System.exit(0);
    }
}
