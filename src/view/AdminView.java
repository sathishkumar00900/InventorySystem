package view;

import controller.AuthController;
import controller.ProductController;
import model.Product;
import java.util.Scanner;

public class AdminView {

    public void showMenu() {

        ProductController pc = new ProductController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nADMIN MENU");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Update Stock");
            System.out.println("4. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> pc.viewProducts();
                case 2 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Qty: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    pc.addProduct(new Product(id, name, qty, price));
                }
                case 3 -> {
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Qty: ");
                    int qty = sc.nextInt();
                    pc.updateStock(id, qty);
                }
                case 4 ->{
                    System.out.println("Logged Out Successfully");
//                    System.exit(0);
                    return;
                }
            }
        }
    }
}
