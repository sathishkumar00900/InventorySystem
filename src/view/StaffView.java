package view;

import controller.ProductController;

import java.util.Scanner;

public class StaffView {

    public void showMenu() {
        ProductController pc = new ProductController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSTAFF MENU");
            System.out.println("1. View Products");
            System.out.println("2. Update Stock");
            System.out.println("3. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> pc.viewProducts();
                case 2 -> {
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Qty: ");
                    int qty = sc.nextInt();
                    pc.updateStock(id, qty);
                }
                case 3 ->{
                    System.out.println("Logging Out");
                    return;
                }
            }
        }
    }
}
