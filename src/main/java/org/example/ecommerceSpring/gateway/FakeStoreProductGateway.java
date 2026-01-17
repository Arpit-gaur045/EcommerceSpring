package org.example.ecommerceSpring.gateway;

import org.example.ecommerceSpring.dto.FakeStoreProductResponseDTO;
import org.example.ecommerceSpring.dto.ProductDTO;
import org.example.ecommerceSpring.gateway.api.FakeStoreProductApi;
import org.example.ecommerceSpring.gateway.api.FakestoreCategoryApi;
import org.springframework.stereotype.Component;


@Component
public class FakeStoreProductGateway implements IProductGateway{

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {

        FakeStoreProductResponseDTO response = this.fakeStoreProductApi.getFakeProduct(id).execute().body();
        if(response==null){
            throw new Exception("Product not found");
        }
        return ProductDTO.builder().price(response.getPrice()).image(response.getImage()).description(response.getDescription()).id(response.getId()).title(response.getTitle()).category(response.getCategory()).stock(response.getStock()).brand(response.getBrand()).build();
       // ProductDTO result = new ProductDTO(response.getImage(),response.getPrice(),response.getDescription(),response.getId(),response.getTitle(),response.getCategory(),response.getStock(),response.getBrand());
       // return result;
    }
}
