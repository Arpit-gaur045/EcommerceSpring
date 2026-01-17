package org.example.ecommerceSpring.mappers;

import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.entity.Product;

public class ProductMapper {


    public static  ProductDTO toDto(Product product) {

        return ProductDTO.builder().price(product.getPrice()).stock(product.getStock()).title(product.getTitle()).image(product.getImage()).brand(product.getBrand()).description(product.getDescription()).category(product.getCategory()).build();
    }


    public static Product toEntity( ProductDTO productDTO){

        return Product.builder().price(productDTO.getPrice()).stock(productDTO.getStock()).title(productDTO.getTitle()).image(productDTO.getImage()).brand(productDTO.getBrand()).description(productDTO.getDescription()).category(productDTO.getCategory()).build();
    }




}
