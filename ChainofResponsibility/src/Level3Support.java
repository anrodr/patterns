public class Level3Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == RequestType.COMPLEX) {
            System.out.println("Level 3 Support handles the request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}