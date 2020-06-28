package com.example.resfulAPI.service;

import com.example.resfulAPI.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAllCategory();
    Optional<Category> findById(Integer id);
    void save(Category category);
    void remove(Category category);
}
