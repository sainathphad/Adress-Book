package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();
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
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNum(phoneNum);
        contact.setEmail(email);
        System.out.println(contact);

    }

    public boolean edit() {
        System.out.println("Enter first Name To Edit");
        String firstName = scanner.next();
        if (!firstName.equals(contact.getFirstName())) {
            return false;
        }
        System.out.println(" Which details you want to edit: ");
        System.out.println(" 1 for changing first name: ");
        System.out.println(" 2 for changing last name: ");
        System.out.println(" 3 for changing address: ");
        System.out.println(" 4 for changing city: ");
        System.out.println(" 5 for changing state: ");
        System.out.println(" 6 for changing zip num: ");
        System.out.println(" 7 for changing phone num: ");
        System.out.println(" 8 for changing email: ");

        System.out.println(" Your Choice ");
        int choice = Integer.valueOf(scanner.next());
        switch (choice) {
            case 1:
                System.out.println(" Enter New Name ");
                contact.setFirstName(scanner.next());
                System.out.println(" First Name changed ");
                break;
            case 2:
                System.out.println(" Enter New Last Name ");
                contact.setLastName(scanner.next());
                System.out.println(" Last Name Changed ");
                break;
            case 3:
                System.out.println(" Enter New Address ");
                contact.setAddress(scanner.next());
                System.out.println(" Address Changed ");
                break;
            case 4:
                System.out.println(" Enter New City ");
                contact.setCity(scanner.next());
                System.out.println(" City Name Changed ");
                break;
            case 5:
                System.out.println(" Enter New State ");
                contact.setState(scanner.next());
                System.out.println(" State Name Changed ");
                break;
            case 6:
                System.out.println(" Enter New Zip Num ");
                contact.setZip(scanner.next());
                System.out.println(" Zip Num Changed ");
                break;
            case 7:
                System.out.println(" Enter New Phone Num ");
                contact.setPhoneNum(scanner.next());
                System.out.println(" Phone Num Changed ");
                break;
            case 8:
                System.out.println(" Enter New Email ");
                contact.setEmail(scanner.next());
                System.out.println(" Email Changed ");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        return true;
    }

    public void delete() {
        System.out.println("Enter first Name to delete");
        String firstName = scanner.next();
        if (contact != null && firstName.equals(contact.getFirstName())) {
            contact = null;
            System.out.println("Contact Deleted");
        } else {
            System.out.println("Invalid Name");
        }
    }
}
