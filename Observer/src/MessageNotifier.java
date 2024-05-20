public class MessageNotifier implements IObserver{

  @Override
  public void update(String user) {
    if(user != null){
      System.out.println("MessageNotifier: Welcome " + user + " !");
    } else {
      System.out.println("MessageNotifier: Goodbye!");
    }
  }
  
}
