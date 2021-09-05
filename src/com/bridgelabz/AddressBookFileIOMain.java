package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookFileIOMain {
    /*
   Declaring The Main Class Here
    */
    public enum IOServices {CONSOLE_IO, FILE_IO}

    public static List<ContactDetails> personContactList;

    /*
    Parametrised Constructor
     */
    public AddressBookFileIOMain(List<ContactDetails> personContactList) {
        this.personContactList = personContactList;
    }

    /*
    Declaring The Read Contact Data Method
    Adding The Details To List
     */
    public static void readContactData(Scanner consoleInputReader) {
        System.out.println("Enter your first name");
        String firstName = consoleInputReader.nextLine();
        System.out.println("Enter your last name");
        String addressCity = consoleInputReader.nextLine();
        System.out.println("Enter your city name");
        String city = consoleInputReader.nextLine();
        System.out.println("Enter your state name");
        String state = consoleInputReader.nextLine();
        System.out.println("Enter your zip  code ");
        String zip = consoleInputReader.nextLine();
        System.out.println("Enter Mobile Number ");
        String phoneNumber = consoleInputReader.nextLine();
        System.out.println("Enter your email Id");
        String email = consoleInputReader.nextLine();
        personContactList.add(new ContactDetails());
    }

    /*
    Declaring The Written Contact Data Method
    If ioService Is File IO Then It Will Print The Write Data Method
     */
    public static void writeContactData(IOServices ioServices) {
        if (ioServices.equals(IOServices.CONSOLE_IO))
            System.out.println("My Contact Details Are " + personContactList);
        else if (ioServices.equals(IOServices.FILE_IO)) ;
        new AddressBookFileIO().writeData(personContactList);
    }

    /*
    Declaring The Main method Here
    Calling The Read Contact Data Method
    Calling The Write Contact Data Method
     */
    public static void main(String[] args) {
        ArrayList<ContactDetails> personContactList = new ArrayList<>();
        AddressBookFileIOMain addressBookFileIOMain = new AddressBookFileIOMain(personContactList);
        Scanner consoleInputReader = new Scanner(System.in);
        addressBookFileIOMain.readContactData(consoleInputReader);
        addressBookFileIOMain.writeContactData(IOServices.FILE_IO);
    }

    /*
    Declaring The Print Data Method
    If ioService Is File IO It Will Implements The Print Data Method
     */
    public void printData(IOServices ioServices) {
        if (ioServices.equals(IOServices.FILE_IO))
            new AddressBookFileIO().printData();
    }
}
