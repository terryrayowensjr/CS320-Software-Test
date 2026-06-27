import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    //tests created contact
    @Test
    void testContactCreation() {
        Contact contact = new Contact(
                "001",
                "Steve",
                "Jones",
                "1112223333",
                "123 North Maple");

        assertEquals("Steve", contact.getFirstName());
    }

    //tests incorrect contactId
    @Test
    void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(
                        "111222333333",
                        "Steve",
                        "Jones",
                        "1112223333",
                        "123 North Maple"));
    }
}