import java.util.ArrayList;
import java.util.List;

public class LogInManager implements ISubject {

  private List<IObserver> observers;
  private String user;

  public LogInManager() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void addObserver(IObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update(user);
    }
  }

  public void loginUser(String username) {
    this.user = username;
    notifyObservers();
  }

  public void logoutUser() {
    this.user = null;
    notifyObservers();
  }
}
