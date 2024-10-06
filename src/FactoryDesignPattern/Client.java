package FactoryDesignPattern;

public class Client {

    public void request(){
        Context context = new Context();
        context.initiateFileReadProcess("JSON");
        context.initiateFileReadProcess("CSV");
    }
}
