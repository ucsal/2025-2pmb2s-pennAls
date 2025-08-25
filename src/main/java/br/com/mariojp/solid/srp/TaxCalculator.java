package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private final double rate;

    public TaxCalculator(double rate) {
        this.rate = rate;
    }

    public double calculateTax(double subtotal) {
        double tax = subtotal * rate;
        return tax;
    }

}
