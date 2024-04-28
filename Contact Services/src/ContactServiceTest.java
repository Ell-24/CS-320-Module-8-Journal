import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//Add New Contact
	@Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("123", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        assertNotNull(contactService.getContact("123"));
	}
	
	//Delete Contact
	//Added new contact than tested if that new contact was deleted
	@Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("456", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        contactService.deleteContact("456");
        assertNull(contactService.getContact("456"));
    }

	
	
	//Contact Id Cannot be Updated
	//New Contacts were created than field was updated
	//Update First Name
    @Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("789", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        contactService.updateFirstName("789", "John");
        assertEquals("John", contact.getfirstName());
    }
    
    //Update Last Name
    @Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("132", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        contactService.updateLastName("132", "Han");
        assertEquals("Han", contact.getlastName());
    }
    
    //Update Phone Number
    @Test
    public void testUpdatePhoneNumber() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("243", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        contactService.updateNumber("243", "0987654321");
        assertEquals("0987654321", contact.getNumber());
    }
    
    //Update Address
    @Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("342", "FirstName", "LastName", "1234567890", "Address");
        contactService.addContact(contact);
        contactService.updateAddress("342", "Street");
        assertEquals("Street", contact.getaddress());
    }
}
