package lsp2.model;

import lsp2.Orderable;

public class Order extends Orderable {

    public Order(int quantity, int price) {
        super(quantity,price);
    }

    public double getAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }
}
