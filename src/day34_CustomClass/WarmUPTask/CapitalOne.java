package day34_CustomClass.WarmUPTask;

import day34_CustomClass.WarmUPTask.BankAccount;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Anna = new BankAccount();
        Anna.setBankAccountInfo("Anna",123456,300);
        System.out.println(Anna);
        Anna.deposit(600);

        System.out.println(Anna);
        Anna.withDraw(950);
        System.out.println(Anna);
        Anna.withDraw(30);

        System.out.println(Anna);





    }
}
