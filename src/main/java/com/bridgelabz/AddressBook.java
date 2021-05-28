package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    //ARRAYLIST TO STORE MULTIPLE CONTACTS
    ArrayList<Contact> contactArrayList = new ArrayList<>();


    public void add() {
        contact = new Contact();
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter City");
        String city = scanner.next();
        System.out.println("Enter State");
        String state = scanner.next();
        System.out.println("Enter Zip Number");
        String zip = scanner.next();
        System.out.println("Enter Phone Number");
        String phoneNum = scanner.next();
        System.out.println("Enter Email");
        String email = scanner.next();

        contactArrayList.add(new Contact(firstName, lastName, address, city, state, zip, phoneNum, email));

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

    public void edit() {
        System.out.println("Enter first Name To Edit");
        String personfirstName = scanner.next();
        if (contactArrayList.isEmpty()) {
            System.out.println("No Contact Found");
        }else {

        for(Contact contact : contactArrayList) {
            String nameCheck = contact.getFirstName();

            if(nameCheck.equals(personfirstName)) {

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
                        System.out.println("Invalid Option \n Valid Options Are : 1, 2, 3, 4, 5, 6, 7, 8");
                        break;
                }
            }    }
        }
    }

    public void delete() {
        System.out.println("Enter first Name to delete");
        String personName = scanner.next();

        for(int i = 0; i < contactArrayList.size(); i++) {
            String contactName = contactArrayList.get(i).getFirstName();
            if (contactName.equalsIgnoreCase(personName)) {
                contactArrayList.remove(i);
                System.out.println("Contact Deleted");
            }
            else {
                System.out.println("Contact Not Found");
            }
        }
    }

    public void menu() {
        System.out.println(" Menu: Choose From Following Option \n 1.To Add Contact \n " +
                "2.To Edit Contact \n 3.To Delete Contact");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3:
                delete();
                break;
            default:
                System.out.println("Invalid option \n Valid Options are: 1, 2, 3");
        }
    }
}
