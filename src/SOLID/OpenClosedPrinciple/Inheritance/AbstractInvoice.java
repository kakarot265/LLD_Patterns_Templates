package SOLID.OpenClosedPrinciple.Inheritance;

// Base class
abstract class AbstractInvoice {
    public abstract double calculateDiscount();
}


///By using polymorphism and inheritance, you can make the system open for extension and closed for modification. Instead of modifying the Invoice class, you introduce a new subclass for each customer type.
// Derived classes for each customer type
class RegularInvoice extends AbstractInvoice {
    @Override
    public double calculateDiscount() {
        return 10;
    }
}

class PremiumInvoice extends AbstractInvoice {
    @Override
    public double calculateDiscount() {
        return 20;
    }
}

class GoldInvoice extends AbstractInvoice {
    @Override
    public double calculateDiscount() {
        return 30;
    }
}
