package behavioral.chainofresponsibility;

public interface IHandler {
    public Response handleRequest(Request request);
    public void setSuccessor(Handler handler);
}
