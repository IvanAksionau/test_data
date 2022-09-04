package utils;

import com.data.pogo.User;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParser extends Parser {
    @Override
    protected User[] readUsersData(File file) {
        BufferedReader reader;
        User[] carInfoArray;
        try {
            reader = new BufferedReader(new FileReader(file));
            Gson gson = new Gson();
            carInfoArray = gson.fromJson(reader, User[].class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return carInfoArray;
    }
}
