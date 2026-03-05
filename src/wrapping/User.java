package wrapping;

//import java.security.MessageDigest;
import java.security.*;
import java.util.*;

public class User {

    private final String username;
    private String password;

    public User(String username, String password) {

        this.username = username;
        if (checkPassword(password)) {
            this.password = password;
        }

    }
    public boolean checkPassword(String password) {
        return password != null && password.length() >= 8;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (checkPassword(oldPassword) && checkPassword(newPassword) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        else {
            return false;
        }
    }
}
