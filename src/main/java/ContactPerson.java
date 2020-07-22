import javax.swing.*;
import java.util.ArrayList;

public class ContactPerson
{
    String firstName,lastName,phoneNumber,city,state,zip;
    ContactPerson(String firstName,String lastName,String phoneNumber,String city,String state,String zip)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }
    public void setPhoneNumber(String sPhoneNum){
        phoneNumber=sPhoneNum;
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
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void print(){
        JOptionPane.showMessageDialog(null,firstName+lastName+phoneNumber+city+state+zip);
    }

}
