package controller.beansDB;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author afflorezc
 */
public class Person implements Serializable{

private int personID;
private String document;
private String firstName;
private String secondName;
private String lastName1;
private String lastName2;
private String birthPlace;
private String hometown;
private String address;
private String cellPhoneNumber;
private String email;
private Date registrationDate;
private boolean admin;

    public Person(String document, String firstName, String secondName, 
            String lastName1, String lastName2, String birthPlace, String hometown,
            String address, String cellPhoneNumber, String email, Date registrationDate, 
            boolean admin) {
        
        this.document = document;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.birthPlace = birthPlace;
        this.hometown = hometown;
        this.address = address;
        this.cellPhoneNumber = cellPhoneNumber;
        this.email = email;
        this.registrationDate = registrationDate;
        this.admin = admin;
    }

    public Person(){}

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getReistrationDate() {
        return registrationDate;
    }

    public void setReistrationDate(Date reistrationDate) {
        this.registrationDate = reistrationDate;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAsAdmin(boolean admin) {
        this.admin = admin;
    }    
}
