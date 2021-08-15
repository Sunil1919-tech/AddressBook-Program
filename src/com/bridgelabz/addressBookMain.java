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
        Book.getMenu();
        Book.showContact();
    }
}
