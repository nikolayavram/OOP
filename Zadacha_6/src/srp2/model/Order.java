package srp2.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
