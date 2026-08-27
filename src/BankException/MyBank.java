package BankException;

import Bank.Bank;

public class MyBank {
    public static void main(String[] args){
        BankAccount obj =new BankAccount("AC001",2000);
        try {
            obj.withdraw(1000);
            System.out.println("Remaining balance = " + obj.balance);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
