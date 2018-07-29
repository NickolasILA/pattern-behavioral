package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handlers.CareerAdviser;
import behavioral.chainofresponsibility.handlers.ExtendedBenefitApprover;
import behavioral.chainofresponsibility.handlers.Manager;

public class ChainOfResponsibilityDemo {
    public static void main (String [] args) {

        // do not knwo here who actually gonna handle it
        Handler handlerChain = buildChain();

        Request request = new Request(RequestTypeE.CONFERENCE, 299);
        handlerChain.handleRequest(request);

        request.setAmount(599);
        handlerChain.handleRequest(request);

        request.setAmount(601);
        handlerChain.handleRequest(request);

        request.setType(RequestTypeE.EXTENDED_BENEFIT);
        request.setAmount(601);
        handlerChain.handleRequest(request);

        request.setAmount(2501);
        handlerChain.handleRequest(request);
    }


    public static Handler buildChain () {
        // building chain of responsibility
        ExtendedBenefitApprover extendedBenefitAprover = new ExtendedBenefitApprover(null);
        Manager manager = new Manager(extendedBenefitAprover);
        CareerAdviser careerAdviser = new CareerAdviser(manager);

        // because we are returning careerAdviser back we will always start journey through the chain from beginning
        return careerAdviser;
    }
}
