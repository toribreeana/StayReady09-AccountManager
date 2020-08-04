package com.codedifferently.bankaccountlab;

public abstract class BankAccount {
    public abstract void deposit(double depositAmt);

    public abstract double getBalance();

    public abstract boolean withdraw(double withdrawAmt);

    public abstract int findAccountNumber();

    public abstract class bankAccount {

        private int accountNumber;
        private int fees;
        private String name;
        private int balance;
        private int rate;
        private String company;
        private int taxId;


        public abstract void deposit(double depositAmount);

        public abstract double getBalance();

        public abstract boolean withdraw(double withdrawAmount);

    }
}

