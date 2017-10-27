package com.micahstrube.bnb;

class Guest {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String creditCardNumber;
    private String creditCardExpiration;

    Guest() {
        this.firstName = "";
        this.lastName = "";
        this.phoneNumber = "000-000-0000";
        this.creditCardNumber = "0000-0000-0000-0000";
        this.creditCardExpiration = "00/00";
    }

    Guest(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = "000-000-0000";
        this.creditCardNumber = "0000-0000-0000-0000";
        this.creditCardExpiration = "00/00";
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getCreditCardNumber() {
        return creditCardNumber;
    }

    void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }
}
