package utils;

import com.data.pogo.User;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class FileParser {
    private static Parser parser;

    private FileParser() {
    }

    public static User[] readUserData(File file) {
        String type;
        type = FilenameUtils.getExtension(file.getAbsolutePath());
        if (type.equals("application/json")) {
            parser = new JsonParser();
        } else if (type.equals("yaml")) {
            parser = new YamlParser();
        }
        return parser.readUsersData(file);
    }
}
