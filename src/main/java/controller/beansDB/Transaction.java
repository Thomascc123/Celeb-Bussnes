package controller.beansDB;

import java.sql.Timestamp;

public class Transaction {

    private int transactionID;
    private int bankAccount;
    private Timestamp transactionDate;
    private double transactionAmount;
    private double initialBalance;
    private double finalBalance;
    private int transactionType; // manejarlo como enumerador

    public Transaction() {
    }

    public Transaction(int bankAccount, Timestamp transactionDate, double transactionAmount, double initialBalance,
            double finalBalance, int transactionType) {
        this.bankAccount = bankAccount;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.transactionType = transactionType;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }
    
}
