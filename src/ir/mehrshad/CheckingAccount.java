package ir.mehrshad;

public class CheckingAccount {
    private int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }
    public boolean withdraw(int amount) throws InterruptedException {
        Thread.sleep((int) (Math.random() * 200));
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}
