package com.example.rent2go.services.category;

import com.example.rent2go.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(int categoryId);
    Category addCategory(Category category);
    Category updateCategory(int categoryId, Category updatedCategory);
    void deleteCategory(int categoryId);
}