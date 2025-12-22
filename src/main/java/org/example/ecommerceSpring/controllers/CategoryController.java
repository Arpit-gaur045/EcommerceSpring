package org.example.ecommerceSpring.controllers;



import org.example.ecommerceSpring.dto.CategoryDTO;
import org.example.ecommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    private ICategoryService categoryService;

    CategoryController(ICategoryService _categoryService){
        this.categoryService= _categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getCategory() throws Exception{
        return this.categoryService.getAllCategories();
    }

    @PostMapping
    public String postCategory(){
        return "post Electronics";
    }


}
