package com.testcase;

import com.bridgelabz.AddressBookFileIOMain;
import com.bridgelabz.ContactDetails;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddressBookIOTest {
    @Test
    public void givenContactDataItShouldBeWrittenIntoFile(){
        ContactDetails[] arrayOfContacts= new ContactDetails[]{
                new ContactDetails()
        };
        AddressBookFileIOMain addressBookFileIOMain =new AddressBookFileIOMain(Arrays.asList(arrayOfContacts));
        addressBookFileIOMain.writeContactData(AddressBookFileIOMain.IOServices.FILE_IO);
        addressBookFileIOMain.printData(AddressBookFileIOMain.IOServices.FILE_IO);
    }

}
