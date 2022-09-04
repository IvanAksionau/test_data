package utils;

import com.data.pogo.User;

import java.io.File;

public abstract class Parser {

    protected abstract User[] readUsersData(File file);
}
