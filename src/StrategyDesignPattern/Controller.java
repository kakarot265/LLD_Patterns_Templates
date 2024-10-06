package StrategyDesignPattern;

import StrategyDesignPattern.ServiceImpl.*;

public class Controller {

    void acceptClientRequest(String paymentType){
        if(paymentType=="Credit"){
           new InitiateTransactionContext(new CreditCardAuth(), new CreditCardPayment(), paymentType);
        }
        else if(paymentType=="Debit"){
            new InitiateTransactionContext(new DebitCardAuth(), new DebitCardPayment(), paymentType);
        }
        else{
            new InitiateTransactionContext(null, new UPIPayment(), paymentType);
        }
    }
}
