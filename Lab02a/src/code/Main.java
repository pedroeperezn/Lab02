/**
 * Main class
 * @author Minh & Pedro
 * @version 1.0
 */
public class Main {

    public static void main(final String[] args) {
        Bank bank;
        bank = new Bank("Bank of Kanada");

        BankAccount account1;
        BankAccount account2;
        BankAccount account3;
        BankAccount account4;

        account1 = new BankAccount(100.0f, "abc111", "woods");
        account2 = new BankAccount(200.0f, "def222", "gates");
        account3 = new BankAccount(300.0f, "ghi333", "bezos");
        account4 = new BankAccount(400.0f, "jkl444", "zuckerberg");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);

        bank.depositTo(22.22f, "def222");

        bank.getAccount("abc111").transfer(5.0f, bank.getAccount("ghi333"));

        bank.printAllCostumerData();
    }
}
