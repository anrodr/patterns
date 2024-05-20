public class App {
    public static void main(String[] args) throws Exception {
        LogInManager logInManager = new LogInManager();

        IObserver auditLogger = new AuditLogger();
        IObserver messageNotifier = new MessageNotifier();
        IObserver securityNotifier = new SecurityNotifier();

        logInManager.addObserver(auditLogger);
        logInManager.addObserver(messageNotifier);
        logInManager.addObserver(securityNotifier);

        System.out.println("User 'John' is logging in.");
        logInManager.loginUser("John");

        System.out.println("User 'John' is logging out.");
        logInManager.logoutUser();
    }
}
