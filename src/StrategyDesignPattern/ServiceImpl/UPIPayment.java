package StrategyDesignPattern.ServiceImpl;

import StrategyDesignPattern.Service.PaymentProcessing;


// UPI in our case does not have auth mechanism. Hence we are just implementing PaymentStrategy Interface.
public class UPIPayment implements PaymentProcessing {
    @Override
    public void processPayment(String payment) {

    }
}
