package org.example.ecommerceSpring.controllers;


import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.services.FakeStoreCategoryService;
import org.example.ecommerceSpring.services.FakeStoreProductService;
import org.example.ecommerceSpring.services.iProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final iProductService productService;

    public ProductController(iProductService productService) {
        this.productService = productService;
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception{
//
//        ProductDTO result = fakeStoreProductService.getProductById(id);
//        return ResponseEntity.ok(result);
//
//    }

 @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception{

         ProductDTO result = productService.getProductById(id);
         return ResponseEntity.ok(result);
 }

 @PostMapping
 public ResponseEntity<ProductDTO>  createProduct(@RequestBody ProductDTO productDTO ){

     return ResponseEntity.ok(productService.createProduct(productDTO));

 }



}
