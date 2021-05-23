package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Contact contact;
    Scanner scanner = new Scanner(System.in);
    public void add() {
        contact = new Contact();
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Enter City");
        String city = scanner.nextLine();
        System.out.println("Enter State");
        String state = scanner.nextLine();
        System.out.println("Enter Zip Number");
        String zip = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNum = scanner.nextLine();
        System.out.println("Enter Email");
        String email = scanner.nextLine();
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
