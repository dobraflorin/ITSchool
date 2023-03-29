package practice.challenge.challengeandreirotariu;
public class Main {
    public static void main(String[] args) {

     Service service = new Service();
     BookAddress bookAddress1 = new BookAddress();

     bookAddress1.setFirstName("Adrian");
     bookAddress1.setLastName("Nechifor");
     bookAddress1.setPhoneNumber("12121212");
     bookAddress1.setEmailAddress("adrian@gmail.com");
     bookAddress1.setAge(26);

        BookAddress bookAddress2 = new BookAddress();

        bookAddress2.setFirstName("Florin");
        bookAddress2.setLastName("Dobra");
        bookAddress2.setPhoneNumber("78787878");
        bookAddress2.setEmailAddress("florin@gmail.com");
        bookAddress2.setAge(36);

        System.out.println("first time" + service.contactList);

        service.addContact(bookAddress1);

        System.out.println("second time" + service.contactList);

        service.removeContact(bookAddress2);

        System.out.println("third time" + service.contactList);
    }
}
