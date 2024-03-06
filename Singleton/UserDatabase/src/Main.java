//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obtain the unique instance of UserDatabase
        UserDatabase database = UserDatabase.getInstance();

        // Operations on the user database
        database.addUser("user1", "password123");
        database.addUser("user2", "password456");

        // Validate users
        System.out.println("User Validation:");
        System.out.println("User1, Password123: " + database.validateUser("user1", "password123"));
        System.out.println("User1, Password456: " + database.validateUser("user1", "password456"));
        System.out.println("User2, Password456: " + database.validateUser("user2", "password456"));

        // Show users in the database
        database.showUsers();

    }
}