package Thread;

public class JavaCup_Synchronized {
}
 class BankAccount {
    private float balance;

    public synchronized void deposit(float amount) {
        balance += amount;
    }

    public synchronized void withdraw(float amount) {
        balance -= amount;
    }
}
