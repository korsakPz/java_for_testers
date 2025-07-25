package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase{
    public ContactHelper(ApplicationManager manager) {

        super(manager, manager.getDriver());
    }

    public void create(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
    }

    private void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if (contactData.getPhotoPath() != null) {
            attach(By.name("photo"), contactData.getPhotoPath());
        }

    }

    private void initContactCreation() {

        click(By.linkText("add new"));
    }

  

    private void submitContactCreation() {
        click(By.name("submit"));
    }

}
