package services;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Product> productCatalog = new ArrayList<>();

    public void addProduct(Product product) {
        productCatalog.add(product);
        System.out.println("Product added successfully!");
    }

    public void removeProduct(int productId) {
        productCatalog.removeIf(p -> p.getProductId() == productId);
        System.out.println("Product removed successfully!");
    }

    public void viewProducts() {
        System.out.println("Products:");
        for (Product product : productCatalog) {
            System.out.println(product);
        }
    }
}
