package util;

import model.User;

public class AuthorizationUtil {

    public User login(String username, String password) {
        for (User user : DataStore.users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
