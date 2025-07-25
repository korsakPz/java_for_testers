package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HelperBase {
    protected final ApplicationManager manager;
    protected WebDriver wd;


//    public HelperBase(ApplicationManager manager) {
//
//        this.manager = manager;
//    }


    public HelperBase(ApplicationManager manager, WebDriver wd) {
        this.manager = manager;
        this.wd = wd;
    }


    protected void type(By locator, String text) {
        click(locator);
        manager.driver.findElement(locator).clear();
        manager.driver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        manager.driver.findElement(locator).click();
    }

    protected void attach(By locator, String filePath) {

        if (filePath != null) {
        File file = new File(filePath);
        if (file.exists()) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }



    }
}
