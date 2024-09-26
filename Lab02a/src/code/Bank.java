import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Minh & Pedro
 * Models the bank's data
 */


class Bank {

    private final String bankName;
    private final Map<String,BankAccount> accounts;

    /**
     * Creates a Bank object with a given name and initializes the accounts map as an empty HashMap
     * @param bankName
     */
    Bank(String bankName)
    {
        this.bankName = bankName;
        accounts = new HashMap<>();
    }

    /**
     * Adds an account into the accounts hash map
     * @param account account to be added to the hash map
     */
    void addAccount(BankAccount account)
    {
        this.accounts.put(account.getAccountNumber(), account);
    }

    /**
     * Retreives the requested account object from the accounts dictionary
     * @param accountNumber Number of the account to retrieve
     * @return BankAccount object of the requested account
     */
    BankAccount getAccount(String accountNumber)
    {
        return this.accounts.get(accountNumber);
    }

    /**
     * Removes an account from the accounts dictionary based on its account number
     * @param accountNumber Number of the account to remove
     */
    void removeAccount(String accountNumber)
    {
        this.accounts.remove(accountNumber);
    }

    /**
     * Returns the number of stored bank accounts in the Bank object
     * @return Number of stored bank accounts (int)
     */
    int getNumberOfAccounts()
    {
        return this.accounts.size();
    }

    float getTotalAccountsBalanceCad()
    {
        // Initialize Set to iterate through the hash map and total balance
        float totalCad = 0;
        final Set<String> accountKeys;

        // Assign accountKeys to the keys found in the hash map
        accountKeys = accounts.keySet();

        // Iterate through the hash map and add the balance of each account to the total
        for(String accountNumber : accountKeys)
        {
            final float balance;
            balance = accounts.get(accountNumber).getAccountBalance();
            totalCad += balance;
        }

        return totalCad;
    }

    /**
     * Deposit a specified amount to a bank account in the bank
     * @param accountNumber recipient account number
     * @param amountCad amount to deposit
     */
    void depositTo(float amountCad, String accountNumber)
    {
        final BankAccount account;
        account = this.accounts.get(accountNumber);
        account.deposit(amountCad);
    }

    void printAllCostumerData()
    {
        // Create set to iterate through the hash map
        final Set<String> accountKeys;
        accountKeys = accounts.keySet();

        //Iterate through the hash map and log the name of each account holder
        for(String accountNumber : accountKeys)
        {
            // Retrieve the name of the account holder
            final BankAccount account;
            account = this.accounts.get(accountNumber);
            // Log their account information
            System.out.println("Costumer " + account.getMemberLastName() + " has $" + account.getAccountBalance() + " in account #" + accountNumber);
        }
        // Log bank status
        System.out.println("Total bank balance in all accounts for " + bankName + " is $" + getTotalAccountsBalanceCad());
    }
}
