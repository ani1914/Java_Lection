package com.citb408;
public class Account {

    private int accountNumber;
    private double accountBalance;
    private static double interestRate = 5;

    public Account() {
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    public void showData() {
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account balance is: " + accountBalance);
        System.out.println("Interest rate is: " + com.netb406.Account.interestRate);
    }

    public void deposit(double amountOfMoney) {
        if (amountOfMoney < 0) {
            System.out.println("You cannot deposit negative number of money");
        } else {
            this.accountBalance += amountOfMoney;
        }
    }

    public void accumulation() {
        this.accountBalance += this.accountBalance * (com.netb406.Account.interestRate / 100);
    }

    public void setAccount_number(int account_number) {
        this.accountNumber = account_number;
    }

    public static void setInterestRate(double interestRatePercentage) {
        com.netb406.Account.interestRate = interestRatePercentage;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
