package com.micahstrube.bnb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {
    @Test
    void guestConstructor() {
        Guest guest = new Guest();
        assertEquals("", guest.getFirstName());
        assertEquals("", guest.getLastName());
        assertEquals("000-000-0000", guest.getPhoneNumber());
        assertEquals("0000-0000-0000-0000", guest.getCreditCardNumber());
        assertEquals("00/00", guest.getCreditCardExpiration());
    }

    @Test
    void guestConstructorFirstNameLastName() {
        Guest guest = new Guest("first", "last");
        assertEquals("first", guest.getFirstName());
        assertEquals("last", guest.getLastName());
        assertEquals("000-000-0000", guest.getPhoneNumber());
        assertEquals("0000-0000-0000-0000", guest.getCreditCardNumber());
        assertEquals("00/00", guest.getCreditCardExpiration());
    }

    @Test
    void getLastName() {
        Guest guest = new Guest("first", "last");
        assertEquals("last", guest.getLastName());
    }

    @Test
    void setLastName() {
        Guest guest = new Guest("first", "last");
        guest.setLastName("newlast");
        assertEquals("newlast", guest.getLastName());
    }

    @Test
    void getFirstName() {
        Guest guest = new Guest("first", "last");
        assertEquals("first", guest.getFirstName());
    }

    @Test
    void setFirstName() {
        Guest guest = new Guest("first", "last");
        guest.setFirstName("newfirst");
        assertEquals("newfirst", guest.getFirstName());
    }

    @Test
    void getPhoneNumber() {
        Guest guest = new Guest();
        guest.setPhoneNumber("111-111-1111");
        assertEquals("111-111-1111", guest.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Guest guest = new Guest();
        guest.setPhoneNumber("111-111-1111");
        assertEquals("111-111-1111", guest.getPhoneNumber());
    }

    @Test
    void getCreditCardNumber() {
        Guest guest = new Guest();
        guest.setCreditCardNumber("1111-1111-1111-1111");
        assertEquals("1111-1111-1111-1111", guest.getCreditCardNumber());
    }

    @Test
    void setCreditCardNumber() {
        Guest guest = new Guest();
        guest.setCreditCardNumber("1111-1111-1111-1111");
        assertEquals("1111-1111-1111-1111", guest.getCreditCardNumber());
    }

    @Test
    void getCreditCardExpiration() {
        Guest guest = new Guest();
        guest.setCreditCardExpiration("01/01");
        assertEquals("01/01", guest.getCreditCardExpiration());
    }

    @Test
    void setCreditCardExpiration() {
        Guest guest = new Guest();
        guest.setCreditCardExpiration("01/01");
        assertEquals("01/01", guest.getCreditCardExpiration());
    }

}