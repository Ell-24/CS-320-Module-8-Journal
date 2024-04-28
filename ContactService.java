import java.util.Map;
import java.util.HashMap;

public class ContactService {
  //Create Map to hold all contacts
  private Map <String, Contact> contacts;

  public ContactService() {
    this.contacts = new HashMap<String, Contact>(); 
  }

  //add new contact function
  public void addContact(Contact contact) {
    contacts.put(contact.getcontactId(), contact);
  }

  //delete an existing contact function
  public void deleteContact(String contactId) {
    contacts.remove(contactId);
  }


  //Update contact service fields
  //contact Id is non-updatable
  public void updateFirstName(String contactId, String firstName) { //Update First Name
    Contact contact = contacts.get(contactId);
    if (contactId != null) {
      contact.setfirstName(firstName);
    }
  }

  public void updateLastName(String contactId, String lastName) { //Update Last Name
    Contact contact = contacts.get(contactId);
    if (contactId != null) {
      contact.setlastName(lastName);
    }
  }

  public void updateNumber(String contactId, String Number) {  //Update Phone Number
    Contact contact = contacts.get(contactId);
    if (contactId != null) {
      contact.setNumber(Number);
    }
  }

  public void updateAddress(String contactId, String address) {  //Update Address
    Contact contact = contacts.get(contactId);
    if (contactId != null) {
      contact.setaddress(address);
    }
  }
  
  
  //Retrieve Contact Object using Id Function 
  public Contact getContact (String contactId) {
	  return contacts.get(contactId);
  }
}

