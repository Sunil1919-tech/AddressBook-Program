package com.bridgelabz;

import java.util.Scanner;

public class newAddressBook {

    Scanner sc = new Scanner(System.in);

    /*
    Declaring The Add Contact Method
    And Entering The Contact Details By Using Scanner Class
    And Printing The Contact Details Of Person
     */
    public void addContact() {
        contactDetails person = new contactDetails();
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your addressCity: ");
        String addressCity = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip.intValue());
        person.setPhoneNumber(phoneNumber.intValue());
        person.setEmail(email);
        System.out.println("The Contact Details of "+firstName+ "\n"+ person);
    }
}