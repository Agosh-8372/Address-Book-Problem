
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
        JOptionPane.showMessageDialog(null,fName+" "+lName+" "+pNum+" "+city+" "+state+" "+zip);
        persons.add(p);
        address.add(pa);
    }

    public void displayPerson() {
        int s = persons.size();
        if (s==0)
            JOptionPane.showMessageDialog(null,"Empty list");
        else {
            for (int i = 0; i < s; i++)
            {
                ContactPerson p = (ContactPerson) persons.get(i);
                p.print();
                System.exit(0);
            }
        }
    }
    public void searchAndEdit (String n)
    {
        for (int i = 0; i <= persons.size(); i++)
        {
            ContactPerson p = (ContactPerson) persons.get(i);
            PersonAddress pa= (PersonAddress)address.get(i);
            if (n.equals(p.getFirstName())) {
                String val = JOptionPane.showInputDialog("Entry found to edit press 1 0r else 2");
                int cs = Integer.parseInt(val);
                if (cs == 1) {
                    String phNum = JOptionPane.showInputDialog("Enter phone number");
                    String city1 = JOptionPane.showInputDialog("Enter city");
                    String state1 = JOptionPane.showInputDialog("Enter state");
                    String zip1 = JOptionPane.showInputDialog("Enter zip code");
                    p.setPhoneNumber(phNum);
                    pa.setCity(city1);
                    pa.setState(state1);
                    pa.setZip(zip1);
                    displayPerson();
                }
            }
            else {
                JOptionPane.showMessageDialog(null ,"Not found");
            }
        }
    }

}