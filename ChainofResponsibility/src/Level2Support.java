public class Level2Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == RequestType.INTERMEDIATE) {
            System.out.println("Level 2 Support handles the request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}