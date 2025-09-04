package create_contact;

import java.util.ArrayList;

public class AddressBookImpl implements AddressBook {
    ArrayList<Contacts> contactList = new ArrayList<>();
    private static AddressBookImpl addressBookObj;

    private AddressBookImpl() {

    }

    @Override
    public void addContact(Contacts contact) {
        contactList.add(contact);
    }

    @Override
    public void display() {
        if (contactList.isEmpty())
            System.out.println("No contacts found");
        else
            System.out.println(contactList);
    }

    public static AddressBookImpl createObject() {
        if (addressBookObj == null)
            addressBookObj = new AddressBookImpl();
        return addressBookObj;
    }

}