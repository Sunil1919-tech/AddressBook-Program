package com.bridgelabz;
//imported collections HashMap Map packages

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

/**
 * purpose - To create Address Book
 * Declaring Main method Here
 *
 * @author Sunil
 * @version 16.0
 * @since 12/08/2021
 */
public class AddressBookMain {
    public static Map<String, AddressBook> addressBookHashMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addDataToAddressBook() {
        String chooseContact, chooseCity;
        do {
            System.out.println("Enter the name of city");
            String cityForMap = sc.nextLine();
            AddressBook addressBook = new AddressBook(cityForMap);
            for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                if (entry.getKey().equals(cityForMap)) {
                    addressBook = entry.getValue();
                }
            }
            addressBookHashMap.put(cityForMap, addressBook);
            do {
                System.out.println("Enter first name:");
                String firstName = sc.nextLine();
                System.out.println("Enter last name:");
                String lastName = sc.nextLine();
                System.out.println("Enter address City:");
                String address = sc.nextLine();
                System.out.println("Enter state name:");
                String state = sc.nextLine();
                System.out.println("Enter zip code:");
                String zipcode = sc.nextLine();
                System.out.println("Enter phone number:");
                String phoneNumber = sc.nextLine();
                System.out.println("Enter emailId number:");
                String email = sc.nextLine();
                ContactDetails contact = new ContactDetails();
                System.out.println("Contact added successfully!!");
                for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(cityForMap)) {
                        entry.getValue().addContact(contact);
                    }
                }
                System.out.println("Do you want to add contact again? Yes|No");
                chooseContact = sc.nextLine();
            } while (chooseContact.equals("yes"));
            System.out.println("Do you want to add another city Yes|No");
            chooseCity = sc.nextLine();
        } while (chooseCity.equals("yes"));
        System.out.println("ADDRESS BOOK :--->" + addressBookHashMap);
    }

    /*
    Declaring Main method Here
    Displaying The Options With Switch Case
    And Printing The Contact Details
    */
    public static void main(String[] args) {
        System.out.println(" Welcome To AddressBook System ");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new contact" + "\n" + "2. Edit contact details" + "\n" + "3. Delete contact details" + "\n" + "4. Show Contacts " + "\n" + "5. Exit" + "\n" + "Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    new AddressBookMain().addDataToAddressBook(); //Add Contact Details
                    break;
                case 2:
                    System.out.println("Enter the address book name (city)");
                    String city = scanner.next();
                    System.out.println("Enter First Name of the contact you want to edit");
                    String checkName = scanner.next();
                    for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase(city)) {
                            entry.getValue().editContact(checkName);
                        } else {
                            System.out.println("The" + city + " address book does not present.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the address book name (city)");
                    city = scanner.next();
                    System.out.println("Enter First Name of the contact you want to delete");
                    String checkName1 = scanner.next();
                    for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase(city)) {
                            entry.getValue().deleteContact(checkName1);
                        } else {
                            System.out.println("The" + city + " address book does not exist.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter CityName , First Name you want to search:");
                    String cityName = scanner.next();
                    String firstName = scanner.next();
                    searchPersonByCity(cityName, firstName);
                    break;

                case 5:
                    System.out.println(Collections.singletonList(addressBookHashMap));
                    for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                        System.out.println(entry.getKey() + entry.getValue().getAddressBook());
                    }
                    break;

                case 6:
                    System.out.println("Enter The Name Of City Of Contact");
                    String cityName1 = scanner.next();
                    viewPersonByCity(cityName1);
                    break;
                case 7:
                    System.out.println("Enter The Name Of City");
                    String cityName2 = scanner.next();
                    countContactsByUsingCity(cityName2);
                    break;
                case 8:
                    sortByName();
                    break;
                case 9:
                    sortByCity();
                    break;
            }
        } while (choice != 10);
    }

}