package com.example.rent2go.services.product;

import com.example.rent2go.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(int productId);
    Product addProduct(Product product);
    Product updateProduct(int productId, Product updatedProduct);
    void deleteProduct(int productId);
}