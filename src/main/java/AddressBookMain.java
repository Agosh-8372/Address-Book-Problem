import javax.swing.*;
import java.util.*;
import java.io.*;
public class AddressBookMain
{
    public static void main(String[] args)
    {
        String input;
        int caseVal;
        AddressBook ab=new AddressBook();
        while(true)
        {
            input = JOptionPane.showInputDialog("Enter 1 to add person\nEnter 2 to exit");
            caseVal=Integer.parseInt(input);
            switch(caseVal)
            {
                case 1:
                    ab.addPersons();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }

}
