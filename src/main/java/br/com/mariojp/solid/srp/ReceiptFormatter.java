package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String formatReceipt(Order order, double total, double tax, double subtotal) {
        StringBuilder sb = new StringBuilder();
        for (var i : order.getItems()) {
            sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity()).append("\n");
        }
        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("Tax: ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }


}
