import javax.swing.*;
import java.util.*;
public class AddressBook {
    ArrayList<ContactPerson>persons;
    ArrayList<PersonAddress>address;
    public AddressBook()
    {
        persons=new ArrayList<ContactPerson>();
        address=new ArrayList<PersonAddress>();
    }
    public void addPersons() {
        String fName = JOptionPane.showInputDialog("Enter Name");
        String lName = JOptionPane.showInputDialog("Enter last Name");
        String pNum = JOptionPane.showInputDialog("Enter phone number");
        String city=JOptionPane.showInputDialog("Enter city");
        String state=JOptionPane.showInputDialog("Enter state");
        String zip=JOptionPane.showInputDialog("Enter zip code");
        ContactPerson p = new ContactPerson(fName, lName, pNum);
        PersonAddress pa=new PersonAddress(city,state,zip);
        persons.add(p);
        address.add(pa);
    }
    public void displayPerson(){
        for(int i=0;i<=persons.size();i++){
           ContactPerson p=(ContactPerson)persons.get(i);
           p.print();
        }
    }
}
