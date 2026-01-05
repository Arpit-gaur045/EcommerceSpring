package org.example.ecommerceSpring.services;

import org.example.ecommerceSpring.dto.ProductDTO;

public interface iProductService {

    ProductDTO getProductById(Long id) throws Exception;
}
