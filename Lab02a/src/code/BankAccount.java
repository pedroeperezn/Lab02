/**
 * @author Minh & Pedro
 * @version 1.0
 * Models a Bank Account
 */

class BankAccount {

    private float balance;
    private final String accountNumber;
    private final String memberLastName;

    /**
     * Constructor of the BankAccount class
     * @param accountNumber Number of bank account
     * @param memberLastName Last name of the bank account holder
     * @param balance Initial balance of the account
     */
    BankAccount(float balance, String accountNumber, String memberLastName)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * Returns the account number of the bank account
     * @return account number (string)
     */
    String getAccountNumber()
    {
        return this.accountNumber;
    }

    /**
     * Returns the last name of the account's holder
     * @return last name (string)
     */
    String getMemberLastName()
    {
        return this.memberLastName;
    }

    /**
     * Retrieves the current balance of the account
     * @return account balance (float)
     */
    float getAccountBalance()
    {
        return this.balance;
    }

    /**
     * Withdraws a specific amount from the bank account
     * @param amountCad
     */
    void withdraw(final float amountCad)
    {
        this.balance -= amountCad;
    }

    /**
     * Deposits a specified amount to the bank account
     * @param amountCad
     */
    void deposit(final float amountCad)
    {
        this.balance += amountCad;
    }

    /**
     * Transfers the specified funds from the current account into a specified recipient
     * @param recipientAccount
     * @param amountCad
     */
    void transfer(final float amountCad, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCad);
        this.withdraw(amountCad);
    }

}
