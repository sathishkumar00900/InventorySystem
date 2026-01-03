package controller;

import model.Product;
import util.DataStore;

public class ProductController {

    public void viewProducts() {
        for (Product p : DataStore.products) {
            System.out.println(
                    p.getId() + " | " +
                            p.getName() + " | " +
                            p.getQuantity() + " | " +
                            p.getPrice()
            );
        }
    }

    public void addProduct(Product product) {
        DataStore.products.add(product);
        System.out.println("Product added successfully!");
    }

    public void updateStock(int id, int qty) {
        for (Product p : DataStore.products) {
            if (p.getId() == id) {
                p.setQuantity(qty);
                System.out.println("Stock updated!");
                return;
            }
        }
        System.out.println("Product not found!");
    }
}
