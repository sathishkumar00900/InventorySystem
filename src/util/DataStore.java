package util;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class DataStore {

    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    static {
        users.add(new User("admin", "admin123", Role.ADMIN));
        users.add(new User("staff", "staff123", Role.STAFF));

        products.add(new Product(1, "Laptop", 10, 55000));
        products.add(new Product(2, "Mouse", 50, 500));
    }
}
