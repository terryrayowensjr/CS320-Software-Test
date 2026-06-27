
public class Contact {

    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    //constructor
    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

        //if statements to confirm that input is correct length and not blank
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException();
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException();
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException();
        if (phoneNumber == null || phoneNumber.length() != 10)
            throw new IllegalArgumentException();
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException();

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //get methods
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    //set methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}