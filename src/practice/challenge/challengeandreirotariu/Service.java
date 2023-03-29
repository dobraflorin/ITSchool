package practice.challenge.challengeandreirotariu;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<BookAddress> contactList = new ArrayList<>();
    {contactList.add(new BookAddress("Bogdan" , "Georgescu" ,
            "1234567" , "bogdan@gmail.com" , 28));}
    public void addContact(BookAddress bock){
        BookAddress bookAddress1 = new BookAddress();
        bookAddress1.setFirstName(bookAddress1.getFirstName());
        bookAddress1.setLastName(bookAddress1.getLastName());
        bookAddress1.setPhoneNumber(bookAddress1.getPhoneNumber());
        bookAddress1.setEmailAddress(bookAddress1.getEmailAddress());
        bookAddress1.setAge(bookAddress1.getAge());
        contactList.add(bookAddress1);

    }
    public void removeContact(BookAddress bookAddress){
        contactList.remove(bookAddress);
    }
}
