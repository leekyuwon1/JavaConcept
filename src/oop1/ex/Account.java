package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount) {

        return balance + amount;
    }

    int withdraw(int amount) {
        return amount;
    }
}
