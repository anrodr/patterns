public class ServiceProxy implements FileService {

  private RemoteService remoteService;
  private String[] authorizedUsers = {"user1"};
  private String currentUser;

  public ServiceProxy(String currentUser) {
    this.remoteService = new RemoteService();
    this.currentUser = currentUser;
  }

  @Override
  public void uploadFile(String fileName) {
    if (isUserAuthorized()) {
      remoteService.uploadFile(fileName);
    } else {
      System.out.println("Access denied. Unauthorized user.");
    }
  }

  @Override
  public void dowloadFile(String fileName) {
    if (isUserAuthorized()) {
      remoteService.dowloadFile(fileName);
    } else {
      System.out.println("Access denied. Unauthorized user.");
    }
  }

  @Override
  public void viewFiles() {
    if (isUserAuthorized()) {
      remoteService.viewFiles();
    } else {
      System.out.println("Access denied. Unauthorized user.");
    }
  }

  @Override
  public void deleteFile(String fileName) {
    if (isUserAuthorized()) {
      remoteService.deleteFile(fileName);
    } else {
      System.out.println("Access denied. Unauthorized user.");
    }
  }

  private boolean isUserAuthorized() {
    String currentUser = getCurrentUser();
    for (String user : authorizedUsers) {
      if (user.equals(currentUser)) {
        return true;
      }
    }
    return false;
  }

  private String getCurrentUser() {
    return this.currentUser;
  }
}
