package com.bridgelabz;

/*
Declaring The ContactDetails Class
And Declaring The Variables
And Defining The Getter And Setter Method
 */
//variables declaring in private class
public class ContactDetails {
    //variable Declaration
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private String email;
    private String zip;
    private String phoneNumber;

    /*
    Declaring The Parametrised Constructor
    To Initialise The Parameters
     */
    public ContactDetails() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {

        this.zip = zip;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
    public boolean equals(Object object) {
        boolean result = false;
        if (object == this) {
            return true;
        }
        ContactDetails contact = (ContactDetails) object;
        if (contact.firstName.equals(this.firstName) && contact.lastName.equals(this.lastName)) {
            result = true;
        }
        return result;
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