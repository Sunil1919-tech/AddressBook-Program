package com.bridgelabz;

/*
Declaring The ContactDetails Class
And Declaring The Variables
And Defining The Getter And Setter Method
 */
//variables declaring in private class
public class contactDetails {
    //variable Declaration
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private String email;
    private Long zip;
    private Long phoneNumber;

    /*
    Declaring The Parametrised Constructor
    To Initialise The Parameters
     */
    public contactDetails(String firstName, String lastName, String addressCity, String state, String email, Long zip, Long phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public contactDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNum(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
Declaring The To String Method
The toString() method returns the string representation of the object
 */
    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}