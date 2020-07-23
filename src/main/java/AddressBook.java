
import javax.swing.*;
import java.util.*;
public class AddressBook {
    ArrayList<ContactPerson> persons;

    public AddressBook() {
        persons = new ArrayList<ContactPerson>();
    }
    public int checkEntry(String fn,String ln){
        for(int i=0;i<persons.size();i++){
            ContactPerson p=(ContactPerson)persons.get(i);
            if( fn.equals(p.getFirstName()) && ln.equals(p.getLastName()))
                return 1;
        }
        return 0;
    }
    public void addPersons() {
        String fName = JOptionPane.showInputDialog("Enter Name");
        String lName = JOptionPane.showInputDialog("Enter last Name");
        int r = checkEntry(fName, lName);
        if (r == 1)
            JOptionPane.showMessageDialog(null, "Entry Exists");
        else {
            String pNum = JOptionPane.showInputDialog("Enter phone number");
            String city = JOptionPane.showInputDialog("Enter city");
            String state = JOptionPane.showInputDialog("Enter state");
            String zip = JOptionPane.showInputDialog("Enter zip code");
            ContactPerson p = new ContactPerson(fName, lName, pNum, city, state, zip);
            JOptionPane.showMessageDialog(null, fName + " " + lName + " " + pNum + " " + city + " " + state + " " + zip);
            persons.add(p);
        }
    }


    public void edit(String n) {
        for (int i = 0; i <= persons.size(); i++) {
            ContactPerson p = (ContactPerson) persons.get(i);
            if (n.equals(p.getFirstName())) {
                JOptionPane.showMessageDialog(null,"Entry found");
                    String phNum = JOptionPane.showInputDialog("Enter phone number");
                    String city1 = JOptionPane.showInputDialog("Enter city");
                    String state1 = JOptionPane.showInputDialog("Enter state");
                    String zip1 = JOptionPane.showInputDialog("Enter zip code");
                    p.setPhoneNumber(phNum);
                    p.setCity(city1);
                    p.setState(state1);
                    p.setZip(zip1);
                }
            }
        }

    public void delete(String n) {
        for (int i = 0; i <= persons.size(); i++)
        {
            ContactPerson p = (ContactPerson) persons.get(i);
            if (n.equals(p.getFirstName()))
            {
                p.print();
                persons.remove(i);
            }
        }

    }
}