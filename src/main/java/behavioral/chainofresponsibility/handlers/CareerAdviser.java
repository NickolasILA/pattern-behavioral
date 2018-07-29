package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.*;

public class CareerAdviser extends Handler {

    public CareerAdviser(Handler successor) {
        this.setSuccessor(successor);
    }

    public Response handleRequest(Request request) {
        if (request.getType()==RequestTypeE.CONFERENCE && request.getAmount()<300) {
            System.out.println("Response decision was made by "+this.getClass()+". Decision: "+ResponseStatusE.CONFIRMED+". Request: "+request.toString());
            return new Response(ResponseStatusE.CONFIRMED);
        } else {
            return this.successor!=null ? this.successor.handleRequest(request) : new Response(ResponseStatusE.UNKNOWN);
        }
    }
}
