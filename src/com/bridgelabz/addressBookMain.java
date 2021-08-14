package com.bridgelabz;
/*
Declaring Main method Here
Defining newContact Object
And Printing The new Contact Details
 */
public class addressBookMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to Address Book Program \n");
        newAddressBook person = new newAddressBook();
        person.addContact();//Calling Add Contacts Method

    }
}