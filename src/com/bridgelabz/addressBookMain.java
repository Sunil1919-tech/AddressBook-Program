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
        addressBook person = new addressBook();
        person.addContact();//Calling Add Contacts Method
        System.out.println("Enter Y To Edit The Contact");
        String op = sc.nextLine();
        //If Condition To Edit The Contact Details Of Person
        if (op.equals("y") || op.equals("Y")) {
             person.editContact(); //Calling The Edit Contact Method
            System.out.println("You have Entered following data");
            System.out.println("The Contact Details After Editing : " + person);
        }
    }
}