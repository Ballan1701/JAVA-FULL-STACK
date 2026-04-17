class Bank{
    int balance = 1000;
    synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + "\nRemaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
class BankThread extends Thread {
    Bank bank;
    int amount;
    BankThread(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }
    public void run() {
        bank.withdraw(amount);
    }
}
public class SynchronizationEg {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankThread b1 = new BankThread(bank, 700);
        BankThread b2 = new BankThread(bank, 500);
        b1.start();
        b2.start();
    }
}
