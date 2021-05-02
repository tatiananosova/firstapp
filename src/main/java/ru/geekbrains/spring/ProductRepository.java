package ru.geekbrains.spring;

import ru.geekbrains.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    Product getProduct(int id);

    void addProduct(String name, int cost);

    boolean deleteProduct(int id);
}
