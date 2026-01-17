package org.example.ecommerceSpring.services;

import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.gateway.FakeStoreProductGateway;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements iProductService {

    private final FakeStoreProductGateway fakeStoreProductGateway;

    public FakeStoreProductService(FakeStoreProductGateway fakeStoreProductGateway){
     this.fakeStoreProductGateway=fakeStoreProductGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception{

        return fakeStoreProductGateway.getProductById(id);
    }

    public ProductDTO createProduct(ProductDTO productDTO){
        return null;
    }

}
