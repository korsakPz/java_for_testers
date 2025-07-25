package manager;

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
        type(By.name("firstname"), contact.getFirstName());
        type(By.name("lastname"), contact.getLastName());
        type(By.name("address"), contact.getAddress());
        type(By.name("email"), contact.getEmail());
        type(By.name("mobile"), contact.getMobilePhone());
    }

    private void submitContactCreation() {
        click(By.name("submit"));
    }

}
