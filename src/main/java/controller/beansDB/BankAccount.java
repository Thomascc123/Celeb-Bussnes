package controller.beansDB;

import java.sql.Date;

public class BankAccount {

    private int accountNumber;
    private int personID;
    private double balance;
    private boolean active;
    private boolean cancelled;
    private boolean embargoed;
    private double embargoedValue;
    private double annualInterest;
    private Date openDate;
    private Date cancelationDate;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double annualInterest, Date openDate) {
        this.accountNumber = accountNumber;
        this.annualInterest = annualInterest;
        this.openDate = openDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isEmbargoed() {
        return embargoed;
    }

    public void setEmbargoed(boolean embargoed) {
        this.embargoed = embargoed;
    }

    public double getEmbargoedValue() {
        return embargoedValue;
    }

    public void setEmbargoedValue(double embargoedValue) {
        this.embargoedValue = embargoedValue;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCancelationDate() {
        return cancelationDate;
    }

    public void setCancelationDate(Date cancelationDate) {
        this.cancelationDate = cancelationDate;
    }

}
