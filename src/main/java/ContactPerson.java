public class ContactPerson
{
    String firstName,lastName,phoneNumber;
    ContactPerson(String firstName,String lastName,String phoneNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
    }
    public void display(){
        System.out.println(firstName+" "+lastName+" "+phoneNumber);
    }

}
