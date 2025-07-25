package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    void canCreateContact() {
        String photoPath = "src/test/resources/images/avatar.png";
        File photo = new File(photoPath);

        if (!photo.exists()) {
            throw new RuntimeException("FILE NOT FOUND: " + photo.getAbsolutePath());
        }
        //System.out.println("ABSOLUTE PATH TO FILE: " + photo.getAbsolutePath());

//        app.contact().create(new ContactData()
//                .withFirstname("Test")
//                .withLastname("User")
//                .withPhoto("src/test/resources/images/avatar.png"));

        var contact = new ContactData()
                .withFirstname(randomString(10))
                .withLastname("Wirr")
                .withPhoto(photoPath);
        app.contact().create(contact);


    }
}
