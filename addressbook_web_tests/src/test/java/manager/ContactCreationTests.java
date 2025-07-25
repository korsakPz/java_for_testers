package manager;

import model.ContactData;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class ContactCreationTests extends TestBase {

    @Test
    void canCreateContact() {
        var contact = new ContactData()
                .withFirstName(randomString(10))
                .withLastName(randomString(10))
                .withAddress("Test Address")
                .withEmail("test@example.com")
                .withMobilePhone("+1234567890")
                .withPhoto("src/test/resources/images/cat.png");;
        app.contact().create(contact);
    }
}
