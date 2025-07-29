package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    void canCreateContact() {
        String imagePath  = "src/test/resources/images/avatar.png";
        System.out.println("Uploading image: " + imagePath);

        app.contact().create(new ContactData()
                .withFirstname(randomString(10))
                .withLastname(randomString(10))
                .withPhoto(imagePath));


    }
}
