import model.GroupData;
import org.junit.jupiter.api.Test;


public class GroupRemovalTests extends TestBase {


    @Test
    public void testRemovalGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup(new GroupData("group_name", "group_header", "group_footer"));

        }
        removeGroup();
    }
}
