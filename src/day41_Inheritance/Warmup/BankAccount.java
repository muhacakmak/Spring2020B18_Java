package day41_Inheritance.Warmup;
/*
WarmUp tasks:
    create costum class called BankAccount for Bank of America' bank accounts:
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and
 */

public class BankAccount {

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName) {
        this.accountHolder = firstName + " " + lastName;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(double amount) {
        // balance+=amount; it can work to

        setBalance(balance + amount);
    }

    public void withdrawing(double amount) {
        if (amount > balance) {
            System.out.println("You don't have $" + amount + "for withdrawing. \nBalance: $" + balance);

        } else {
            setBalance(balance - amount);
        }
    }

    public void checkBalance() {
        //System.out.println("Available Balance $:"+balance);;
        System.out.println("Available Balance: $"+getBalance());;


    }

    public String toString() {
        return "Full name: " + getAccountHolder() + ", Balance: $" + getBalance();
    }


}
