package manager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;


public class GroupHelper extends HelperBase{

    public GroupHelper(ApplicationManager manager) {

        super(manager, manager.getDriver());
    }

    public void openGroupsPage() {
        if (!manager.isElementPresent(By.name("new"))) {
            click(By.linkText("groups"));
        }
    }

  public void createGroup(GroupData group) {
        openGroupsPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupsPage();
    }

    public void modifyGroup(GroupData group, GroupData modifiedGroup) {
        openGroupsPage();
        selectGroup(group); // -------------------
        initGroupModification();
        fillGroupForm(modifiedGroup);
        submitGroupModification();
        returnToGroupsPage();

    }

    public void removeGroup(GroupData group) {
        openGroupsPage();
        selectGroup(group);
        removeSelectedGroups();
        returnToGroupsPage();

    }

    private void fillGroupForm(GroupData group) {

        type(By.name("group_name"), group.name());
        type(By.name("group_header"), group.header());
        type(By.name("group_footer"), group.footer());
    }

    private void submitGroupCreation() {
        click(By.name("submit"));
    }



    private void initGroupCreation() {
        click(By.name("new"));
    }


    private void removeSelectedGroups() {
        click(By.name("delete"));
    }


    private void returnToGroupsPage() {

        click(By.linkText("group page"));
    }

    private void submitGroupModification() {

        click(By.name("update"));

    }


    private void initGroupModification() {

        click(By.name("edit"));
    }

    private void selectGroup(GroupData group) {

        click(By.cssSelector(String.format("input[name='selected[]'][value='%s']", group.id())));
    }

    public int getCount() {
        openGroupsPage();
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    public void removeAllGroups() {
        openGroupsPage();
        selectAllGroups();
        removeSelectedGroups();

    }

    private void selectAllGroups() {
        List<WebElement> checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }

    public List<GroupData> getList() {
        openGroupsPage();
       var groups = new ArrayList<GroupData>();
       var spans = manager.driver.findElements(By.cssSelector("span.group"));
       for (var span : spans) {
           var name = span.getText();
           var checkbox = span.findElement(By.name("selected[]"));
           var id = checkbox.getAttribute("value");
           groups.add(new GroupData().withId(id).withName(name));
       }


       return groups;
    }
}
