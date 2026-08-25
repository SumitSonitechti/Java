package Bank;

public abstract class Bank {
    int balance;
    public Bank(int balance){
        this.balance =balance;
    }
    public abstract int rateofinterest();
    public void deposit(int amount){

    }
}
