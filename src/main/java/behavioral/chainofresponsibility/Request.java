package behavioral.chainofresponsibility;

public class Request {
    private RequestTypeE type;
    private Integer amount;

    public Request(RequestTypeE type, Integer amount) {
        this.type = type;
        this.amount = amount;
    }

    public RequestTypeE getType() {
        return type;
    }

    public void setType(RequestTypeE type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", amount=" + amount +
                '}';
    }
}
