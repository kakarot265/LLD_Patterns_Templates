package StrategyDesignPattern;

import StrategyDesignPattern.Service.AuthProcess;
import StrategyDesignPattern.Service.PaymentProcessing;

public class InitiateTransactionContext {

    AuthProcess authProcess;

    PaymentProcessing paymentProcessing;

    InitiateTransactionContext(AuthProcess authProcess, PaymentProcessing paymentProcessing, String paymentType){
        this.authProcess = authProcess;
        this.paymentProcessing = paymentProcessing;
        process(paymentType);

    }

    void process(String type){
        paymentProcessing.processPayment("23");
        if(type!="UPI"){
            authProcess.authenticateUser("12");
        }
    }


}
