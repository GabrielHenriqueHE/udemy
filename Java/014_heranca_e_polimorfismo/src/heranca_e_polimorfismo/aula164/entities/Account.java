package heranca_e_polimorfismo.aula164.entities;

public abstract class Account {
    private int number;
    private String holder;
    protected double balance;

    public Account() {}
    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withDraw(double amount) {
        this.balance -= amount + 5.00;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

}
