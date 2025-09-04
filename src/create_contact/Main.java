package create_contact;

public class Main {

    public static void main(String[] args) {
        Contacts contactBook = new Contacts.ContactBuilder()
                .firstName("Sumukha")
                .lastName("MG")
                .phoneNo(1234567890)
                .address("HSR Layout sector 5")
                .city("Bengaluru")
                .state("Karnataka")
                .email("sumukha@gmail.com")
                .build();

        System.out.println(contactBook);
    }

}
