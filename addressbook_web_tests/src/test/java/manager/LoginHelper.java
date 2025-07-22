package manager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase{

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }
    void login(String user, String password) {

        click(By.name("user"));
        //manager.driver.findElement(By.name("user")).click();
        type(By.name("user"), user);
        //manager.driver.findElement(By.name("user")).sendKeys(user);
        click(By.name("pass"));
        //manager.driver.findElement(By.name("pass")).click();
        type(By.name("pass"), password);
        //manager.driver.findElement(By.name("pass")).sendKeys(password);
        click(By.xpath("(//input[@value=\'Login\'])[1]"));
        //manager.driver.findElement(By.xpath("(//input[@value=\'Login\'])[1]")).click();
    }
}
