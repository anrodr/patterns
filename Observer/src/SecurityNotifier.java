public class SecurityNotifier implements IObserver{

  @Override
  public void update(String user) {
    if(user != null){
      System.out.println("SecurityNotifier: User " + user + " has logged in. Sending security notification.");
    } else {
      System.out.println("SecurityNotifier: User has logged out.");
    }
  } 
}
