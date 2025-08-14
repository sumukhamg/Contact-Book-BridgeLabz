package create_contact;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacts contactBook = new Contacts.ContactBuilder().build();
        AddressBookImpl addressBook = AddressBookImpl.createObject();

        while (true) {
            System.out.println("Please Enter a choice: ");
            System.out.println("1. Add new Contact");
            System.out.println("2. Edit existing contact");
            System.out.println("3. To delete a person");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter firstName: ");
                    String firstName = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Enter lastName: ");
                    String lastNAme = sc.nextLine();

                    System.out.println("Enter Phone Number ");
                    long phone = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.println("Enter City: ");
                    String city = sc.nextLine();

                    System.out.println("Enter State: ");
                    String state = sc.nextLine();

                    System.out.println("Enter email: ");
                    String email = sc.nextLine();

                    contactBook = new Contacts.ContactBuilder()
                            .firstName(firstName)
                            .lastName(lastNAme)
                            .phoneNo(phone)
                            .address(address)
                            .city(city)
                            .state(state)
                            .email(email)
                            .build();
                    addressBook.addContact(contactBook);
                    break;

                case 2:
                    System.out.println("Please enter the first name of the person");
                    String name = sc.nextLine();
                    sc.nextLine();

                    for (int i = 0; i < addressBook.contactList.size(); i++) {
                        if (addressBook.isPresent(name)) {
                            System.out.println("Enter new name:");
                            String newName = sc.nextLine();
                            addressBook.editName(i, newName);
                        } else {
                            System.out.println("Invalid name");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Please enter the first name of the person");
                    String deleteName = sc.nextLine();
                    sc.nextLine();
                    if (!addressBook.contactList.isEmpty()) {
                        for (int i = 0; i < addressBook.contactList.size(); i++) {

                            if (addressBook.isPresent(deleteName)) {
                                addressBook.deleteContact(i, deleteName);
                            } else {
                                System.out.println("Invalid name");
                            }
                        }
                    } else {
                        System.out.println("Contact list is empty");
                    }

                    break;

                default:
                    System.out.println("Exiting switch");
                    return;

            }
        }

        // Contacts contactBook = new Contacts.ContactBuilder()
        // .firstName(firstName)
        // .lastName(lastNAme)
        // .phoneNo(phone)
        // .address(address)
        // .city(city)
        // .state(state)
        // .email(email)
        // .build();

        // System.out.println(contactBook);
    }

}
