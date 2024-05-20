public class Main {
    public static void main(String[] args) {
        Handler level1 = new Level1Support();
        Handler level2 = new Level2Support();
        Handler level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        SupportRequest request1 = new SupportRequest("Reset password", RequestType.SIMPLE);
        SupportRequest request2 = new SupportRequest("Fix software bug", RequestType.INTERMEDIATE);
        SupportRequest request3 = new SupportRequest("Repair hardware", RequestType.COMPLEX);
        SupportRequest request4 = new SupportRequest("Fix operating system", RequestType.INTERMEDIATE);

        level1.handleRequest(request1);
        level1.handleRequest(request2);
        level1.handleRequest(request3);
        level1.handleRequest(request4);
    }
}
