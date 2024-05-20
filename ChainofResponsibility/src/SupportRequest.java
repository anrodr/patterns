public class SupportRequest {
    private String description;
    private RequestType type;

    public SupportRequest(String description, RequestType type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public RequestType getType() {
        return type;
    }
}