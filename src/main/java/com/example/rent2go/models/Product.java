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
    @Column(name = "id")
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(length = 1000, name = "description")
    private String description;

    @Column(nullable = false, name = "price")
    private double price;

    @Column(name = "discountPercentage")
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


    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "images")
    private List<String> productImages;
}

