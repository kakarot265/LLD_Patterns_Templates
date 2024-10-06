package SOLID.SingleResponsibilityPrinciple;

public class SingleResponsibilityPrinciple {

    public double calculateTotal() {
        // logic to calculate invoice total
        return 0.0;
    }

    public void saveToFile() {
        // logic to save invoice data to a file
    }
}

////////Refactored Code, after splitting up the above class to maintain the
// single responsibility principle////////////////
 class CalculateTotal{
    public double calculateTotal() {
        // logic to calculate invoice total
        return 0.0;
    }
}

class SaveToFile{
    public void saveToFile() {
        // logic to save invoice data to a file
    }
}
