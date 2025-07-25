package manager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase{

    public LoginHelper(ApplicationManager manager) {
        super(manager, manager.getDriver());
    }
    void login(String user, String password) {

        click(By.name("user"));
        type(By.name("user"), user);
        click(By.name("pass"));
        type(By.name("pass"), password);
        click(By.xpath("(//input[@value=\'Login\'])[1]"));

    }
}
