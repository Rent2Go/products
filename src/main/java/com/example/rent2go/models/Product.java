package com.example.rent2go.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000, name = "description")
    private String productDescription;

    @Column(nullable = false, name = "price")
    private double productPrice;

    @Column(name = "discount_percentage")
    private double discountPercentage;

    @Column(name = "rating")
    private double productRating;

    @Column(name = "stock")
    private int availableStock;

    @Column(name = "brand")
    private String brand;

    @Column(name = "category")
    private String productCategory;

    @Column(name = "thumbnail")
    private String thumbnailUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_url")
    private List<String> productImages;
}

