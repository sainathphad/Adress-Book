package com.bridgelabz;

import java.util.Objects;
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
    public boolean edit() {
        System.out.println("Enter first Name");
        String firstName = scanner.nextLine();
        if(firstName.equals(contact.getFirstName())){
            return false;
        }
        System.out.println("Which details you want to edit:");
        System.out.println("press 1 for changing first name:");
        System.out.println("press 2 for changing last name:");
        System.out.println("press 3 for changing address:");
        System.out.println("press4 for changing city:");
        System.out.println("press 5 for changing state:");
        System.out.println("press 6 for changing zip num:");
        System.out.println("press 7 for changing phone num:");
        System.out.println("press 8 for changing email:");
        int choice = Integer.valueOf(scanner.next());
        switch (choice){
            case 1: contact.setFirstName(scanner.nextLine());
                break;
            case 2: contact.setLastName(scanner.nextLine());
                break;
            case 3: contact.setAddress(scanner.nextLine());
                break;
            case 4: contact.setCity(scanner.nextLine());
                break;
            case 5: contact.setState(scanner.nextLine());
                break;
            case 6: contact.setZip(scanner.nextLine());
                break;
            case 7: contact.setPhoneNum(scanner.nextLine());
                break;
            case 8: contact.setEmail(scanner.nextLine());
                break;
        }
        return true;
    }
}
