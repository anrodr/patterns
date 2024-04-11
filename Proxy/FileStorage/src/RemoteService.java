import java.util.ArrayList;
import java.util.List;

public class RemoteService implements FileService {

  private List<String> files;

  public RemoteService() {
    this.files = new ArrayList<>();
  }

  @Override
  public void uploadFile(String fileName) {
    if (files.contains(fileName)) {
      System.out.println("File '" + fileName + "' already exists on remote server.");
    } else {
      System.out.println("Uploading file '" + fileName + "' to remote server");
      files.add(fileName);
    }
  }

  @Override
  public void dowloadFile(String fileName) {
    if (files.contains(fileName)) {
      System.out.println("Downloading file '" + fileName + "' from remote server");
    } else {
      System.out.println("File '" + fileName + "' does not exist on remote server.");
    }
  }

  @Override
  public void viewFiles() {
    if (files.isEmpty()) {
      System.out.println("There are no files in the remote server");
    } else {
      System.out.println("Existing files:");
      for (String file : files) {
        System.out.println("- " + file);
      }
    }
  }

  @Override
  public void deleteFile(String fileName) {
    if (files.contains(fileName)) {
      System.out.println("Deleting '" + fileName + "' from remote server.");
      files.remove(fileName);
    } else {
      System.out.println("File '" + fileName + "' does not exist in remote server");
    }
  }
  
}
