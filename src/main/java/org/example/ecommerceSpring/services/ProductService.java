package org.example.ecommerceSpring.services;


import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.entity.Product;
import org.example.ecommerceSpring.mappers.ProductMapper;
import org.example.ecommerceSpring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements iProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


   public  ProductDTO getProductById(Long id) throws Exception{

        Optional<Product> ops= productRepository.findById(id);
        if(ops.isEmpty()){
            throw new Exception("Product not found");
        }

        return ProductMapper.toDto(ops.get());
    }

    public ProductDTO createProduct(ProductDTO productDTO) {


        Product saved =productRepository.save(ProductMapper.toEntity(productDTO));
        return productDTO;

    }
}
