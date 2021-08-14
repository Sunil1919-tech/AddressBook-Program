package com.bridgelabz;

import java.util.Scanner;

/*
Declaring Main method Here
Defining newContact Object
And Printing The new Contact Details
 */
public class addressBookMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to Address Book Program \n");
        Scanner sc = new Scanner(System.in);
        addressBook Book = new addressBook();
        Book.addContact();//Calling Add Contacts Method
        System.out.println(Book.person);
        System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Book.editContact();
                System.out.println("You have Entered following data");
                System.out.println(Book.person);
                System.out.println("Thank you for Using the Address book");
                break;
            case 2:
                Book.deleteContact();
                System.out.println("Address Book details :" + Book.person);
                break;
        }
    }
}