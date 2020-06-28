package com.example.resfulAPI.controller;

import com.example.resfulAPI.model.Category;
import com.example.resfulAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category/")
public class CategoryManagerController {

    private CategoryService categoryService;
    @Autowired
    public CategoryManagerController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("getAll")
    private ResponseEntity<List<Category>> findAllCategory(){
        List<Category> categories = categoryService.findAllCategory();
        if (categories.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
