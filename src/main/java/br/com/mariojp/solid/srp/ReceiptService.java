package br.com.mariojp.solid.srp;

public class ReceiptService {
    private final TaxCalculator taxCalculator;
    private final ReceiptFormatter receiptFormatter;

    public ReceiptService() {
        double rate = Double.parseDouble(System.getProperty("tax.rate"));
        this.taxCalculator = new TaxCalculator(rate);
        this.receiptFormatter = new ReceiptFormatter();
    }

	public String generate(Order order) {
        double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        double tax = taxCalculator.calculateTax(subtotal);
        double total = subtotal + tax;
       return receiptFormatter.formatReceipt(order,total,tax,subtotal);

    }
}
