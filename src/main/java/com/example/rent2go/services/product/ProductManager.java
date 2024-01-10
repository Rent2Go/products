package com.example.rent2go.services.product;

import com.example.rent2go.models.Product;
import com.example.rent2go.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(int productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int productId, Product updatedProduct) {
        Optional<Product> existingProductOptional = productRepository.findById(productId);

        if (existingProductOptional.isPresent()) {
            Product existingProduct = existingProductOptional.get();
            existingProduct.setTitle(updatedProduct.getTitle());
            existingProduct.setProductDescription(updatedProduct.getProductDescription());
            existingProduct.setProductPrice(updatedProduct.getProductPrice());
            existingProduct.setDiscountPercentage(updatedProduct.getDiscountPercentage());
            existingProduct.setProductRating(updatedProduct.getProductRating());
            existingProduct.setAvailableStock(updatedProduct.getAvailableStock());
            existingProduct.setBrand(updatedProduct.getBrand());
            existingProduct.setProductCategory(updatedProduct.getProductCategory());
            existingProduct.setThumbnailUrl(updatedProduct.getThumbnailUrl());
            existingProduct.setProductImages(updatedProduct.getProductImages());

            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }
    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}