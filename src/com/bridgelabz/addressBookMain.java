package com.bridgelabz;
/*
Declaring Main method Here
Defining newContact Object
And Printing The Contact Details
 */
public class addressBookMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to Address Book Program \n");
        contactDetails newContact = new contactDetails();
        newContact.setFirstName("Sunil \n");
        newContact.setLastName("Gollapalli \n");
        newContact.setAddressCity("Jangaon \n");
        newContact.setState("Telangana \n");
        newContact.setZip(506167) ;
        newContact.setPhoneNumber(967650195);
        newContact.setEmail("sunilgollapalli19@gmail.com .\n");
        System.out.println("The Contact is : \n" +newContact);

    }
}