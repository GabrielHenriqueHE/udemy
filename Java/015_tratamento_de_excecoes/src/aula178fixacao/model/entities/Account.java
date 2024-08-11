package aula178fixacao.model.entities;

import aula178fixacao.model.exceptions.AccountException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {}
    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) throws AccountException {
        if (amount <= 0.0) {
            throw new AccountException("At: Account.deposit() -> Invalid value for deposit. Must be greater than zero.");
        }

        this.balance += amount;
        System.out.printf("New balance: %.2f", this.getBalance());
    }

    public void withDraw(double amount) throws RuntimeException {
        if (amount <= 0.0) {
            throw new AccountException("At: Account.withDraw() -> Invalid value for withdraw. Must be greater than zero.");
        }

        if (amount > this.withdrawLimit) {
            throw new AccountException("At: Account.withDraw() -> The amount exceeds withdraw limit.");
        }

        if (amount > this.balance) {
            throw new AccountException("At: Account.withDraw() -> Not enough balance.");
        }

        this.balance -= amount;
        System.out.printf("New balance: %.2f", this.getBalance());
    }

    public int getNumber() {
        return number;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

}
