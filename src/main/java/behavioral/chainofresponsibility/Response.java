package behavioral.chainofresponsibility;

public class Response {
    private ResponseStatusE status;

    public Response(ResponseStatusE status) {
        this.status = status;
    }

    public ResponseStatusE getStatus() {
        return status;
    }

    public void setStatus(ResponseStatusE status) {
        this.status = status;
    }
}
