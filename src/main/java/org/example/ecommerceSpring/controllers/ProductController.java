package org.example.ecommerceSpring.controllers;


import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.services.FakeStoreCategoryService;
import org.example.ecommerceSpring.services.FakeStoreProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final FakeStoreProductService fakeStoreProductService;

    public ProductController(FakeStoreProductService fakeStoreProductService){
        this.fakeStoreProductService=fakeStoreProductService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception{

        ProductDTO result = fakeStoreProductService.getProductById(id);
        return ResponseEntity.ok(result);

    }
}
