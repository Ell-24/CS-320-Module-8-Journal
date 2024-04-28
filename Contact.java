class Contact {
  //Declare Variables
  private String contactId;
  private String firstName;
  private String lastName;
  private String Number;
  private String address;

  //constructor for contact object
  public Contact(String contactId, String firstName, String lastName, String Number, String address) {
    this.contactId = contactId; 
    this.firstName = firstName;
    this.lastName = lastName;
    this.Number = Number;
    this.address = address;

    //Error handling for the contact object
    if (contactId == null || contactId.length() > 10) { //Error for ContactId
      throw new IllegalArgumentException("The Contact Id cannot be empty or more than 10 characters");
    }

    if (firstName == null || firstName.length() > 10) { //Error for First Name
      throw new IllegalArgumentException("The first name cannot be empty or more than 10 characters");
    }

    if (lastName == null || lastName.length() > 10) { //Error for Last Name
      throw new IllegalArgumentException("The last name cannot be empty or more than 10 characters");
    }

    if (Number == null || Number.length() != 10) { //Error for Phone Number
      throw new IllegalArgumentException("The Phone number cannot be empty and must be 10 characters");
    }

    if (address == null || address.length() > 30) { //Error for Address
      throw new IllegalArgumentException("The address cannot be empty or more than 30 characters");
    }
    
  }

  //getters for contact object
  public String getcontactId() {
    return contactId;
  }
  public String getfirstName() {
    return firstName;
  }
  public String getlastName() {
    return lastName;
  }
  public String getNumber() {
    return Number;
  }
  public String getaddress() {
    return address;
  }


  //setters for contact object
  public void setcontactId(String contactId) {
    this.contactId = contactId;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public void setNumber(String Number) {
    this.Number = Number;
  }

  public void setaddress(String address) {
    this.address = address;
  }

  
}