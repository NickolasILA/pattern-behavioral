package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.*;

public class Manager extends Handler {

    public Manager(Handler successor) {
        this.setSuccessor(successor);
    }

    public Response handleRequest(Request request) {
        if (request.getType()==RequestTypeE.CONFERENCE) {
            ResponseStatusE status = ResponseStatusE.DENIED;
            if (request.getAmount()<600) {
                status = ResponseStatusE.CONFIRMED;
            }
            System.out.println("Response decision was made by "+this.getClass()+". Decision: "+status+". Request: "+request.toString());
            return new Response(status);
        } else {
            return this.successor!=null ? this.successor.handleRequest(request) : new Response(ResponseStatusE.UNKNOWN);
        }
    }
}
