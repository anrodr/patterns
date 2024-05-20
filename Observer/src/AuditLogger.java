public class AuditLogger implements IObserver {

  @Override
  public void update(String user) {
    if(user != null){
      System.out.println("AuditLogger: User " + user + " has logged in.");
    } else {
      System.out.println("AuditLogger: User has logged out.");
    }
  } 
}
