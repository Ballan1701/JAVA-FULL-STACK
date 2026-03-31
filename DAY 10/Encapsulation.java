//Encapsulation
class BankAccount{
    private double balance;
    double amount;
    public void setBalance(double balance){
        if(balance>0) this.balance = balance;
        else System.out.println("Input not valid");
    }
    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
       if(amount > 0) {
        balance += amount;
        System.out.println("Amount deposited : "+amount);
       } 
       else System.out.println("Invalid input !");
    }
    public void withdraw (double amount){
       if(amount <= balance){
        balance -= amount;
        System.out.println("Amount withdrawed : "+amount);
       }
       else System.out.println("Insufficicent balance");
    }
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.setBalance(759);
        System.out.println(b.getBalance());
        b.deposit(1804);
        System.out.println(b.getBalance());
        b.withdraw(1251);
        System.out.println(b.getBalance());

    }
}
