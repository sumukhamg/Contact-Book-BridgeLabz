package create_contact;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firstName: ");
        String firstName = sc.nextLine();

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

        Contacts contactBook = new Contacts.ContactBuilder()
                .firstName(firstName)
                .lastName(lastNAme)
                .phoneNo(phone)
                .address(address)
                .city(city)
                .state(state)
                .email(email)
                .build();

        System.out.println(contactBook);
    }

}
