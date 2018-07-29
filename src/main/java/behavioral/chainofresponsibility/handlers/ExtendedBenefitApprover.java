package behavioral.chainofresponsibility.handlers;

import behavioral.chainofresponsibility.*;

public class ExtendedBenefitApprover extends Handler {

    public ExtendedBenefitApprover(Handler successor) {
        this.setSuccessor(successor);
    }

    public Response handleRequest(Request request) {
        if (request.getType()==RequestTypeE.EXTENDED_BENEFIT ) {
            System.out.println("Response decision was made by "+this.getClass());
            ResponseStatusE status = request.getAmount()<2500 ? ResponseStatusE.CONFIRMED : ResponseStatusE.DENIED;
            System.out.println("Response decision was made by "+this.getClass()+". Decision: "+status+". Request: "+request.toString());
            return new Response(status);
        } else {
            System.out.println("Response decision was made by "+this.getClass()+". Decision: "+ResponseStatusE.UNKNOWN+". Request: "+request.toString());
            return new Response(ResponseStatusE.UNKNOWN);
        }
    }
}
