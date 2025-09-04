public class Bank {

    public static void main(String[] args) {
        Customer c1 = new Customer("Sumukh", 111111111, 20);
        Customer c2 = new Customer("Suresh", 222222222, 18);
        Customer c3 = new Customer("Ramesh", 777777777, 28);
        Customer c4 = new Customer("Mahesh", 888888888, 20);

        c1.account.deposite(10000);
        c1.account.withdraw(2000);
        System.out.println(c1.accountNumber);
        System.out.println(c1.account.getBalance());

        c2.account.deposite(60000);
        c2.account.withdraw(7000);
        System.out.println(c2.accountNumber);
        System.out.println(c2.account.getBalance());

        c3.account.deposite(30000);
        System.out.println(c3.accountNumber);
        c3.account.withdraw(2500);
        System.out.println(c3.account.getBalance());

        c4.account.deposite(1000);
        System.out.println(c4.accountNumber);
        c4.account.withdraw(200);
        System.out.println(c4.account.getBalance());

    }

}
