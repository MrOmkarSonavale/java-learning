//encapsulation

public class encapsulation {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        bank.deposite(10);
        bank.deposite(30);

        System.out.println("current balance is " + bank.getBalance());

        bank.withdraw(5);

        System.out.println("current balance is " + bank.getBalance());

    }
};

class BankAccount {
    private double balance;

    public void withdraw(int amount) {
        // validations
        if (amount <= 0)
            return;
        // set balance
        balance -= amount;
    };

    public void deposite(int amount) {
        // validation
        if (amount <= balance)
            return;
        // set balance
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
};
