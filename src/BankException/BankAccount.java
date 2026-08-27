package BankException;

public class BankAccount {
    double balance;
    String accountNumber;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException("Balance is less than withdrawal Amount");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdraw Success");

        }
    }
}
