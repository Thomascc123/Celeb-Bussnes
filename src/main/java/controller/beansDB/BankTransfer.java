package controller.beansDB;

import java.sql.Timestamp;

public class BankTransfer {

    private int transferID;
    private int emiterAccount;
    private int receptorAccount;
    private Timestamp transferDate;
    private double transferAmount;
    private double emiterInitialBalance;
    private double emiterFinalBalance;
    private double receptorInitialBalance;
    private double receptorFinalBalance;

    public BankTransfer() {
    }

    public BankTransfer(int emiterAccount, int receptorAccount, Timestamp transferDate, double transferAmount,
            double emiterInitialBalance, double emiterFinalBalance, double receptorInitialBalance,
            double receptorFinalBalance) {
        this.emiterAccount = emiterAccount;
        this.receptorAccount = receptorAccount;
        this.transferDate = transferDate;
        this.transferAmount = transferAmount;
        this.emiterInitialBalance = emiterInitialBalance;
        this.emiterFinalBalance = emiterFinalBalance;
        this.receptorInitialBalance = receptorInitialBalance;
        this.receptorFinalBalance = receptorFinalBalance;
    }

    public int getTransferID() {
        return transferID;
    }

    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }

    public int getEmiterAccount() {
        return emiterAccount;
    }

    public void setEmiterAccount(int emiterAccount) {
        this.emiterAccount = emiterAccount;
    }

    public int getReceptorAccount() {
        return receptorAccount;
    }

    public void setReceptorAccount(int receptorAccount) {
        this.receptorAccount = receptorAccount;
    }

    public Timestamp getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Timestamp transferDate) {
        this.transferDate = transferDate;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public double getEmiterInitialBalance() {
        return emiterInitialBalance;
    }

    public void setEmiterInitialBalance(double emiterInitialBalance) {
        this.emiterInitialBalance = emiterInitialBalance;
    }

    public double getEmiterFinalBalance() {
        return emiterFinalBalance;
    }

    public void setEmiterFinalBalance(double emiterFinalBalance) {
        this.emiterFinalBalance = emiterFinalBalance;
    }

    public double getReceptorInitialBalance() {
        return receptorInitialBalance;
    }

    public void setReceptorInitialBalance(double receptorInitialBalance) {
        this.receptorInitialBalance = receptorInitialBalance;
    }

    public double getReceptorFinalBalance() {
        return receptorFinalBalance;
    }

    public void setReceptorFinalBalance(double receptorFinalBalance) {
        this.receptorFinalBalance = receptorFinalBalance;
    }

}
