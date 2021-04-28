package ru.geekbrains.mvc.repository;

import org.springframework.stereotype.Repository;
import ru.geekbrains.mvc.dto.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final static List<Product> database;

    static {
        database = new ArrayList<>();
        database.add(new Product(1, "Potato", 4));
        database.add(new Product(2, "Tomato", 5));
        database.add(new Product(3, "Sweet Potato", 6));
        database.add(new Product(4, "Cucumber", 7));
        database.add(new Product(5, "Radish", 8));
        database.add(new Product(6, "Paper", 9));
        database.add(new Product(7, "Paper Bell", 10));
        database.add(new Product(8, "Horse Radish", 1));
        database.add(new Product(9, "Zucchini", 2));
        database.add(new Product(10, "Pumpkin", 3));
    }
    public void add(Product product) {
        database.add(product);
    }
    public Product getProduct(int id) {
        return database.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public List<Product> getProducts() {
        return database;
    }

}
