package StrategyDesignPattern;

public class Client {

    void initializeRequest(){
        Controller controller = new Controller();
        String paymentType = ""; // defined paymentType via client
        controller.acceptClientRequest(paymentType);
    }
}
