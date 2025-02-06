package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;


public class CreateGroupTests extends TestBase {


    @Test
    public void testCreateGroup() {

        app.groups().openGroupsPage();
        app.groups().createGroup(new GroupData("name", "header", "footer"));

    }

    @Test
    public void testCreateGroupWithEmptyName() {

        app.groups().openGroupsPage();
        app.groups().createGroup(new GroupData());

    }

    @Test
    public void testCreateGroupWithNameOnly() {

        app.groups().openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
        app.createGroup(groupWithName);

    }

}
