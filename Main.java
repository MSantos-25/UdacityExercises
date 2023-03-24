package ContactsManagerOOP;

import java.util.jar.Attributes.Name;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String [] args) {
        ContactsManager myContactsManager = new ContactsManager();
    
        Contact friendLew = new Contact();
        friendLew.name="Lewis";
        friendLew.phoneNumber="44";

        Contact friendMax = new Contact();
        friendMax.name="Max";
        friendMax.phoneNumber="33";

        myContactsManager.addContact(friendLew);
        myContactsManager.addContact(friendMax);

        Contact result = myContactsManager.searchContact("Lewis");
        System.out.println(result.phoneNumber); 

        

    }
}
