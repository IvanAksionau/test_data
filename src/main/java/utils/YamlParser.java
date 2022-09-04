package utils;

import com.data.pogo.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class YamlParser extends Parser {
    @Override
    protected User[] readUsersData(File file) {
        User[] user;
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            user = mapper.readValue(file, User[].class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
