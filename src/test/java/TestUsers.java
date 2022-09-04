import com.data.pogo.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataReader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class TestUsers {
    @Test
    public void pressAndHoldDemoTest() {
        List<File> readFiles =  DataReader.readFiles("admin_users");

        List<User> list1 = Arrays.asList(DataReader.collectUsers(readFiles.get(0)));
        List<User> list2 = Arrays.asList(DataReader.collectUsers(readFiles.get(1)));

        Assert.assertTrue(list1.containsAll(list2), "Both lists contains the same users");

        Assert.assertFalse(list1.stream().anyMatch(user -> user.getId() > 0 || user.getName().isEmpty()),
                "User contains required fields");

        Assert.assertFalse(list2.stream().anyMatch(user -> user.getId() > 0 || user.getName().isEmpty()),
                "User contains required fields");
    }
}
