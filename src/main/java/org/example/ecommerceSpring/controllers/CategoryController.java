package org.example.ecommerceSpring.controllers;



import org.example.ecommerceSpring.dto.CategoryDTO;
import org.example.ecommerceSpring.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/products/categories")
public class CategoryController {

    private ICategoryService categoryService;

    CategoryController(ICategoryService _categoryService){
        this.categoryService= _categoryService;
    }

    @GetMapping("/products/categories")
    public ResponseEntity<List<CategoryDTO>> getCategory() throws Exception{
        List<CategoryDTO> result = this.categoryService.getAllCategories();
        return ResponseEntity.ok(result);
    }



    @PostMapping
    public String postCategory(){
        return "post Electronics";
    }



}
