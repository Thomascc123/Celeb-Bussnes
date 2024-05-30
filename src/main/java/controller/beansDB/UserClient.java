package controller.beansDB;

public class UserClient {

    private int clientID;
    private int personID;
    private String userName;
    private String password;
    private boolean celebrity;
    private boolean hasBankAccount;

    public UserClient() {

    }

    public UserClient(String userName, String password, boolean celebrity, boolean hasBankAccount) {
        this.userName = userName;
        this.password = password;
        this.celebrity = celebrity;
        this.hasBankAccount = hasBankAccount;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCelebrity() {
        return celebrity;
    }

    public void setCelebrity(boolean celebrity) {
        this.celebrity = celebrity;
    }

    public boolean hasBankAccount() {
        return hasBankAccount;
    }

    public void setHasBankAccount(boolean hasBankAccount) {
        this.hasBankAccount = hasBankAccount;
    }

}
