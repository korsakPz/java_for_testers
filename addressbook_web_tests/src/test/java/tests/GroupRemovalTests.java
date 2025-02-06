package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;


public class GroupRemovalTests extends TestBase {


    @Test
    public void testRemovalGroup() {
        app.groups().openGroupsPage();
        if (!app.isGroupPresent()) {
            app.createGroup(new GroupData("group_name", "group_header", "group_footer"));

        }
        app.removeGroup();
    }
}
