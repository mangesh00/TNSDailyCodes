package main;

import entities.Product;
import services.AdminService;
import java.util.Scanner;

public class OnlineShoppingApp {
    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminMenu(adminService, scanner);
                    break;
                case 2:
                    System.out.println("Customer menu is under development...");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void adminMenu(AdminService adminService, Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Product\n2. Remove Product\n3. View Products\n4. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Stock Quantity: ");
                    int stock = scanner.nextInt();
                    adminService.addProduct(new Product(id, name, price, stock));
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = scanner.nextInt();
                    adminService.removeProduct(removeId);
                    break;
                case 3:
                    adminService.viewProducts();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
