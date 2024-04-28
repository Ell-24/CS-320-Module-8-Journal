import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	
	//Exceed limit to Contact field Error testing
	//Contact Id
	 @Test
	 public void testContactIdGreaterThan10Errror() {
		 assertThrows(IllegalArgumentException.class, () -> new Contact("GreaterThan10", "FirstName", "LastName", "1234567890", "Address"));
	 }
	 //First Name
	 @Test
	 public void testContactFirstNameGreaterThan10Error() {
		 assertThrows(IllegalArgumentException.class, () -> new Contact("123", "GreaterThan10", "LastName", "1234567890", "Address"));
	 }
	 //Last Name
	 @Test
	 public void testContactLastNameGreaterThan10Error() {
		 assertThrows(IllegalArgumentException.class, () -> new Contact("123", "FirstName", "GreaterThan10", "1234567890", "Address"));
	 }
	 //Address
	 @Test
	 public void testContactAddressGreaterThan30Error() {
		 assertThrows(IllegalArgumentException.class, () -> new Contact("123", "FirstName", "LastName", "1234567890", "GreaterThan30..12345678901234567890"));
	 }
	 
	 
	 //Phone Number Field Tests
	 //Ensure that equals to 10 does not throw error
	 @Test
	 public void testContactNumberEquals10() {
	    assertDoesNotThrow(() -> new Contact("123", "FirstName", "LastName", "1234567890", "Address"));
	 }
	 //Error if less than 10
	 @Test
	 public void testContactNumberLessThan10Error() {;
	    assertThrows(IllegalArgumentException.class, () -> new Contact("456", "FirstName", "LastName","123","Address"));
	 }
	 //Error if Greater than 10
	 @Test
	 public void testContactNumbeGreatorThan10Error() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("789", "FirstName", "LastName","12345678999","Address"));
	 }
	 
	 //If Contact field is null testing
	 //Null Contact Id
	 @Test
	 public void testNullContactIdError() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Null", "Null", "1234567890", "Null"));
	 }
	 //Null First Name
	 @Test
	 public void testNullContactFirstNameError() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("Null", null , "Null", "1234567890", "Null"));
	 }
	 @Test
	 //Null Last Name
	 public void testNullContactLastNameError() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("Null", "Null" , null , "1234567890", "Null"));
	 }
	 @Test
	 //Null Phone Number
	 public void testNullContactPhoneNumberError() {
		 assertThrows(IllegalArgumentException.class, () -> new Contact("Null", "Null" , "Null", null , "Null"));
	 }
	 @Test
	 //Null Address
	 public void testNullContactAddressError() {
	    assertThrows(IllegalArgumentException.class, () -> new Contact("Null", "Null" , "Null", "1234567890", null));
	 }
}