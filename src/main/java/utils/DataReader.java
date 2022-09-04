package utils;

import com.data.pogo.User;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DataReader {
    private static Parser parser;

    private DataReader() {
    }

    public static List<File> readFiles(String name) {
        File folder = new File("src/main/resources");
        return Arrays.stream(Objects.requireNonNull(folder.listFiles()))
                .filter(file -> file.getName().split("\\.")[0].equals(name))
                .collect(Collectors.toList());
    }

    public static User[] collectUsers(File file) {
        String type;
        type = FilenameUtils.getExtension(file.getAbsolutePath());
        if (type.equals("json")) {
            parser = new JsonParser();
        } else if (type.equals("yaml")) {
            parser = new YamlParser();
        }
        // TODO: 9/5/2022 cath nulpointerExeption
        return parser.readUsersData(file);
    }
}
