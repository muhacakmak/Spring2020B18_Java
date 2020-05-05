package day33_CustomClass;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance() {
        System.out.println("your available  balance : "+balance);


    }

    public void withDraw(double amount) {
        System.out.println("Withdrawing $"+amount);
        balance-=amount;

    }

    public void deposit(double amount) {
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }

    public void setBankAccountInfo(String accountHolderName, int bankAccountNumber,double balanceAmount){
        accountHolder=accountHolderName;
        accountNumber=bankAccountNumber;
        balance=balanceAmount;
    }
    public String toString(){
        return "Hi,\nMr/Mss"+ accountHolder+"\nAccount Number: "+accountHolder+"\nAvilable balance "+balance;
    }


}
