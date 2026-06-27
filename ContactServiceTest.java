import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    //add contact
    @Test
    void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "001",
                "Steve",
                "Jones",
                "1112223333",
                "123 North Maple");

        service.addContact(contact);

        assertEquals("Steve",
                service.getContact("001").getFirstName());
    }

    //deletes a contact
    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
                "001",
                "Steve",
                "Jones",
                "1112223333",
                "123 North Maple");

        service.addContact(contact);
        service.deleteContact("001");

        assertNull(service.getContact("001"));
    }

    //update contact
    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();

        Contact contact = new Contact(
                "001",
                "Steve",
                "Jones",
                "1234567890",
                "123 Main St");

        service.addContact(contact);

        service.updateFirstName("001", "Joe");

        assertEquals("Joe",
                service.getContact("001").getFirstName());
    }
}