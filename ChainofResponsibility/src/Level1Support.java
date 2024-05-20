public class Level1Support extends Handler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == RequestType.SIMPLE) {
            System.out.println("Level 1 Support handles the request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}