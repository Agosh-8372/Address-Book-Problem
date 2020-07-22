
import javax.swing.*;
import java.util.*;
public class AddressBook {
    ArrayList<ContactPerson> persons;

    public AddressBook() {
        persons = new ArrayList<ContactPerson>();
    }

    public void addPersons() {
        String fName = JOptionPane.showInputDialog("Enter Name");
        String lName = JOptionPane.showInputDialog("Enter last Name");
        String pNum = JOptionPane.showInputDialog("Enter phone number");
        String city = JOptionPane.showInputDialog("Enter city");
        String state = JOptionPane.showInputDialog("Enter state");
        String zip = JOptionPane.showInputDialog("Enter zip code");
        ContactPerson p = new ContactPerson(fName, lName, pNum, city, state, zip);
        JOptionPane.showMessageDialog(null, fName + " " + lName + " " + pNum + " " + city + " " + state + " " + zip);
        persons.add(p);
    }


    public void searchAndEdit(String n) {
        for (int i = 0; i <= persons.size(); i++) {
            ContactPerson p = (ContactPerson) persons.get(i);
            if (n.equals(p.getFirstName())) {
                String val = JOptionPane.showInputDialog("Entry found to edit press 1 0r else 2");
                int cs = Integer.parseInt(val);
                if (cs == 1) {
                    String phNum = JOptionPane.showInputDialog("Enter phone number");
                    String city1 = JOptionPane.showInputDialog("Enter city");
                    String state1 = JOptionPane.showInputDialog("Enter state");
                    String zip1 = JOptionPane.showInputDialog("Enter zip code");
                    p.setPhoneNumber(phNum);
                    p.setCity(city1);
                    p.setState(state1);
                    p.setZip(zip1);
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
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
                return;
            }
            else
                JOptionPane.showMessageDialog(null,"No such record found");
        }

    }
}