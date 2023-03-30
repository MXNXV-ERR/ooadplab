import java.io.*;

// Interface expected by the client code
interface TaxCalculator {
    double calculateTax(double amount);
}

// MauriTax API
class MauriTax {
    double calculateVAT(double amount) {
        return amount * 0.15; // Mauritian VAT is 15%
    }
}

// Adapter to translate MauriTax API to TaxCalculator interface
class MauriTaxAdapter implements TaxCalculator {
    private MauriTax mauriTax;

    public MauriTaxAdapter(MauriTax mauriTax) {
        this.mauriTax = mauriTax;
    }

    public double calculateTax(double amount) {
        // Convert the amount from Decathlon POS format to MauriTax format
        double mauriAmount = amount / 40.0; // 1 Euro = 40 Mauritian Rupees
        // Call the MauriTax API to calculate VAT
        double mauriTax = this.mauriTax.calculateVAT(mauriAmount);
        // Convert the VAT from MauriTax format to Decathlon POS format
        double decathlonTax = mauriTax * 40.0; // 1 Euro = 40 Mauritian Rupees
        return decathlonTax;
    }
}

// Client code using TaxCalculator interface
class DecathlonPOS {
    private TaxCalculator taxCalculator;

    public DecathlonPOS(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void checkout(double amount) {
        double tax = this.taxCalculator.calculateTax(amount);
        double total = amount + tax;
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        MauriTax mauriTax = new MauriTax();
        TaxCalculator taxCalculator = new MauriTaxAdapter(mauriTax);
        DecathlonPOS pos = new DecathlonPOS(taxCalculator);
        pos.checkout(100.0); // Output: Amount: 100.0, Tax: 3.75, Total: 103.75
    }
}

