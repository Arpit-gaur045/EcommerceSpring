package org.example.ecommerceSpring.services;


import org.example.ecommerceSpring.dto.CategoryDTO;
import org.example.ecommerceSpring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {


    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(@Qualifier("fakeStoreRestTemplateGateway")  ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }



    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
         List<CategoryDTO> dtoList= this.categoryGateway.getAllCategories().stream()
                .map(category -> {
                    CategoryDTO dto = new CategoryDTO();
                    dto.setName(category);
                    return dto;
                })
                .toList();;
                return dtoList;
    }





    }
    






