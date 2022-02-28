public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Yeung",50.5);
        bank.addCustomer("Adelaide","Kim",123.32);
        bank.addCustomer("Adelaide","Sun",4214.2);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Tim",232.3);

        bank.addCustomerTransaction("Adelaide", "Yeung", 44.2);
        bank.addCustomerTransaction("Adelaide", "Yeung", 88);
        bank.addCustomerTransaction("Adelaide", "Kim", 4.2);
        bank.addCustomerTransaction("Adelaide", "Kim", 4.6);

        bank.listCustomer("Adelaide",true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error");

        }
    }
}
