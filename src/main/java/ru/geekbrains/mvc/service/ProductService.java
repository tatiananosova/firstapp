package ru.geekbrains.mvc.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.geekbrains.mvc.dto.Product;
import ru.geekbrains.mvc.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductService {
    private final ProductRepository productRepository;

    public void add(Product product) {
        log.debug("Adding product");
        productRepository.add(product);
    }

    public List<Product> getProducts() {
        log.debug("All products");
        return productRepository.getProducts();
    }
    public Product getProduct(int id) {
        log.debug("Get product");
        return productRepository.getProduct(id);
    }

}
