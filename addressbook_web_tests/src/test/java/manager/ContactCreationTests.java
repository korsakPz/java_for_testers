package manager;

import model.ContactData;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class ContactCreationTests extends TestBase {

    @Test
    void canCreateContact() {
        var contact = new ContactData()
        app.contact().create(new ContactData()
                .withFirstname("Test")
                .withLastname("User")
                .withPhoto("src/test/resources/images/avatar.png"));
    }
}
