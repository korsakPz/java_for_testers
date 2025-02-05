import model.GroupData;
import org.junit.jupiter.api.Test;


public class CreateGroupTests extends TestBase {


    @Test
    public void testCreateGroup() {

        openGroupsPage();
        createGroup(new GroupData("name", "header", "footer"));

    }

    @Test
    public void testCreateGroupWithEmptyName() {

        openGroupsPage();
        createGroup(new GroupData());

    }

    @Test
    public void testCreateGroupWithNameOnly() {

        openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
        createGroup(groupWithName);

    }

}
