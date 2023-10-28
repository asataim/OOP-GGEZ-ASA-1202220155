import java.util.Scanner;


class Account {
    private String name;
    private String account_number;
    private double balance;

    Scanner keyboard = new Scanner(System.in);


    public Account(String name, String account_number, double balance) {
       this.name = name;
        this.account_number = account_number;
        this.balance = balance; 
    }  

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            return;
        }
    }


    public String getAccountNumber() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}