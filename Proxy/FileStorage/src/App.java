public class App {
    public static void main(String[] args) throws Exception {
        String currentUser = "user1"; // user1 is the only user authorized, change currentUser to try unauthorized acces

        FileService fileService = new ServiceProxy(currentUser);

        for (int i = 1; i < 10; i++) {
            String file = "file" + i + ".txt";
            fileService.uploadFile(file);
        }

        fileService.uploadFile("file10.txt"); // Attempt to upload a new file
        fileService.uploadFile("file1.txt"); // Attempt to upload an existing file

        fileService.viewFiles();
        fileService.dowloadFile("file1.txt"); // Attempt to download a file
        fileService.dowloadFile("file99.txt"); // Attempt to download a nonexisting file

        fileService.deleteFile("file1.txt"); // Attempt to delete an existing file
        fileService.deleteFile("file99.txt"); // Attempt to delete a nonexisting file

        fileService.viewFiles();
    }
}
