package SOLID.OpenClosedPrinciple.Inheritance;

class Invoice {
    public double calculateDiscount(String customerType) {
        if (customerType.equals("Regular")) {
            return 10;
        } else if (customerType.equals("Premium")) {
            return 20;
        } else {
            return 0;
        }
    }
}

//Problem: Every time a new customer type is introduced (e.g., "Gold"), you need to modify the existing method, risking bugs and affecting tested code.
