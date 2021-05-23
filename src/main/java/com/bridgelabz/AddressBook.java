package com.bridgelabz;

public class AddressBook {

    Contact contact;

    public void add() {
        contact = new Contact();

        contact.setFirstName("abc");
        contact.setLastName("xyz");
        contact.setAddress("xyc jkl");
        contact.setCity("pqr");
        contact.setState("asd");
        contact.setZip("4003");
        contact.setPhoneNum("513412");
        contact.setEmail("xyz@mail");
        System.out.println(contact);

    }

}
