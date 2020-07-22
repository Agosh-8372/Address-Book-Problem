import javax.swing.*;
import java.util.*;
import java.io.*;
public class AddressBookMain
{
    public static void main(String[] args)
    {
        String input;
        int cs;
        AddressBook ab=new AddressBook();
        while(true)
        {
            input = JOptionPane.showInputDialog("Enter 1 to add person\n Enter 2 to display\nEnter 3 to exit");
            cs=Integer.parseInt(input);
            switch(cs)
            {
                case 1:
                    ab.addPersons();
                    break;
                case 2:
                    ab.displayPerson();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

}
