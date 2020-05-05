package day34;

public class BankAccount {
    /*
   create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
     */
    String accountHolder;
    long accountNumber;
    double balance;

    public void showBalance() {

        System.out.println("Available  balance : $" + balance);
    }

    public void withDraw(double amount) {
        System.out.println("Withdrawing $" + amount);
        if (balance < amount) {
            balance -= (amount + 35);
            System.out.println("Available  balance : $" + balance);
        } else if (balance <= 0) {
            System.out.println("You don't have enough money to withdraw $" + amount +
                    "\nAvailable  balance : $" + balance);
            System.exit(0);

        } else {
            balance -= amount;
            System.out.println("Available  balance : $" + balance);

        }
    }
    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
        System.out.println("Available  balance : $" + balance);
    }
    public void setBankAccountInfo(String accountHolderName, int bankAccountNumber, double balanceAmount) {
        accountHolder = accountHolderName;
        accountNumber = bankAccountNumber;
        balance = balanceAmount;
    }
    public String toString() {
        String result= "";
        if(balance>0) {
            result= "Dear " + accountHolder + ",\nHere is your information: " + "\nAccount Number: "
                    + accountNumber + "\nAvailable balance $" + balance;
        }else{
            result= "Dear " + accountHolder + ",\nHere is your information: " + "\nAccount Number: "
                    + accountNumber + "\nYou don't have enough money ";
            System.exit(0);


        }
        return result;
    }


}
