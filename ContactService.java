import java.util.ArrayList;

public class ContactService {

    // data structure
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Adds a contact if the ID is unique
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException();
            }
        }
        contacts.add(contact);
    }

    // delete contact
    public void deleteContact(String contactId) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactId().equals(contactId)) {
                contacts.remove(i);
                return;
            }
        }
    }

    //update first name
    public void updateFirstName(String contactId, String firstName) {
        getContact(contactId).setFirstName(firstName);
    }

    //update last name
    public void updateLastName(String contactId, String lastName) {
        getContact(contactId).setLastName(lastName);
    }

    //update phone number
    public void updatePhoneNumber(String contactId, String phoneNumber) {
        getContact(contactId).setPhoneNumber(phoneNumber);
    }

    //update address
    public void updateAddress(String contactId, String address) {
        getContact(contactId).setAddress(address);
    }

    //returns contact
    public Contact getContact(String contactId) {
        for (Contact c : contacts) {
            if (c.getContactId().equals(contactId)) {
                return c;
            }
        }
        return null;
    }
}