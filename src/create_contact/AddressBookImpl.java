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

    public boolean isPresent(String firstName) {
        if (contactList.isEmpty())
            return false;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName() == firstName) {
                return true;
            }

        }
        return false;
    }

    public void editName(int idx, String newName) {
        contactList.get(idx).setFirstName(newName);
        System.out.println("Edited contact: ");
        System.out.println(contactList);
    }

}