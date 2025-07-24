package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupRemovalTests extends TestBase {


    @Test
    public void canRemoveGroup() {

        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("", "", "", ""));

        }

        var oldGroups = app.groups().getList();
        var rnd = new Random();
        var index = rnd.nextInt(oldGroups.size());
        app.groups().removeGroup(oldGroups.get(index));
        var newGroups = app.groups().getList();
        var expextedList = new ArrayList<>(oldGroups);
        expextedList.remove(index);
        Assertions.assertEquals(newGroups.size(), expextedList);

    }

    @Test
    void canRemoveAllGroupsAtOnce () {

        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("", "", "", ""));

        }

        app.groups().removeAllGroups();
        Assertions.assertEquals(0, app.groups().getCount());

    }

}
