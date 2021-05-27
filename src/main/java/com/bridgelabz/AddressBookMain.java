package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Address Book Program");
        AddressBook addressBook = new AddressBook();

        System.out.println(" Enter Option : 1.To Add Contact 2.To Edit Contact 3.To Delete Contact");

        int menu = Integer.valueOf(scanner.next());
        switch (menu) {
            case 1:
                addressBook.add();
                break;
            case 2:
                addressBook.edit();
                break;
            case 3:
                addressBook.delete();
                break;
            default :
                System.out.println("Invalid option \n Valid Options are: 1, 2, 3");
        }



    }
}
