package controller.beansDB;

public class UserAdmin {

    private int adminID;
    private int personID;
    private String userName;
    private String password;
    private double salary;
    private boolean hasBankAccount;
    
    public UserAdmin() {
    }

    public UserAdmin(String userName, String password, double salary, boolean hasBankAccount) {
        this.userName = userName;
        this.password = password;
        this.salary = salary;
        this.hasBankAccount = hasBankAccount;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean hasBankAccount() {
        return hasBankAccount;
    }

    public void setHasBankAccount(boolean hasBankAccount) {
        this.hasBankAccount = hasBankAccount;
    }

    

}
