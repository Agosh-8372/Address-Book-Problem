import java.util.*;
import java.io.*;
public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome To Address Book");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String fName=sc.nextLine();
        System.out.println("Enter last name");
        String lName=sc.nextLine();
        System.out.println("Enter Phone number");
        String pNum=sc.nextLine();
        System.out.println("Enter city");
        String cty=sc.nextLine();
        System.out.println("Enter state");
        String state=sc.nextLine();
        System.out.println("Enter zip code");
        long zip=sc.nextLong();
        ContactPerson cp=new ContactPerson(fName,lName,pNum);
        PersonAddress pa=new PersonAddress(cty,state,zip);
        cp.display();
        pa.printAddress();


    }
}
