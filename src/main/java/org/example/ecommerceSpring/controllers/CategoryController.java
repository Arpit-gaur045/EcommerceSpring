package org.example.ecommerceSpring.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Electronics";
    }

    @PostMapping
    public String postCategory(){
        return "post Electronics";
    }


}
