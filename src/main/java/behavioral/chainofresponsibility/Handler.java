package behavioral.chainofresponsibility;

public abstract class Handler implements IHandler{
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
