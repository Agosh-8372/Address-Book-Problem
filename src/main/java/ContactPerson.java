import javax.swing.*;
import java.util.ArrayList;

public class ContactPerson
{
    String firstName,lastName,phoneNumber;
    ContactPerson(String firstName,String lastName,String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public void setPhoneNumber(String sPhoneNum){
        phoneNumber=sPhoneNum;
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
        JOptionPane.showMessageDialog(null,firstName+lastName+phoneNumber);
        System.exit(0);
    }

}
