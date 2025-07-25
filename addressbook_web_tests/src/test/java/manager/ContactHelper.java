package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase{
    public ContactHelper(ApplicationManager app) {
        super(app);
    }

    public void create(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
    }

    private void initContactCreation() {
        click(By.linkText("add new"));
    }

    private void fillContactForm(ContactData contact) {

        private void fillContactForm(ContactData contactData) {
            type(By.name("firstname"), contactData.getFirstname());
            type(By.name("lastname"), contactData.getLastname());

            if (contactData.getPhotoPath() != null) {
                attach(By.name("photo"), contactData.getPhotoPath());
            }
        }
    }

    private void submitContactCreation() {
        click(By.name("submit"));
    }

}
