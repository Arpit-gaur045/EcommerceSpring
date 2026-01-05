package org.example.ecommerceSpring.gateway;

import org.example.ecommerceSpring.dto.ProductDTO;

public interface IProductGateway {

    ProductDTO getProductById(Long id) throws Exception;
}
