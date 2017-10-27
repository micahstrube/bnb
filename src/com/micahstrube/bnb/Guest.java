package com.micahstrube.bnb;

public class Guest {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String creditCardNumber;
    private String creditCardExpiration;

    public Guest() {
        this.firstName = "";
        this.lastName = "";
        this.phoneNumber = "000-000-0000";
        this.creditCardNumber = "0000-0000-0000-0000";
        this.creditCardExpiration = "00/00";
    }

    public Guest(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = "000-000-0000";
        this.creditCardNumber = "0000-0000-0000-0000";
        this.creditCardExpiration = "00/00";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    public void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }
}
