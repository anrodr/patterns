import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private static UserDatabase instance;
    private final Map<String, String> users;

    // Private constructor to prevent instantiation from outside the class
    private UserDatabase() {
        this.users = new HashMap<>();
    }

    // Method to obtain the only instance of the class
    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }

    // Methods for operations on the user database
    public void addUser(String username, String password) {
        users.put(username, password);
    }

    public boolean validateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void showUsers() {
        System.out.println("Users in the database:");
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println("User: " + entry.getKey() + ", Password: " + entry.getValue());
        }
    }
}
