package com.example.resfulAPI.service;

import com.example.resfulAPI.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllProduct();
    Optional<Product> findById(Integer id);
    void save(Product product);
    void remove(Product product);
}
