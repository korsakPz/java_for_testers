package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase{

    @Test
    void canModificationGroup() {

        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("", "", "", ""));

        }

        app.groups().modifyGroup(new GroupData().withName("modified name"));
    }
}
