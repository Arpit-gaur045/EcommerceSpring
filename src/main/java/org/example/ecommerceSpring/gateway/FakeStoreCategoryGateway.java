package org.example.ecommerceSpring.gateway;

import org.example.ecommerceSpring.dto.CategoryDTO;
import org.example.ecommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.ecommerceSpring.gateway.api.FakestoreCategoryApi;
import org.example.ecommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {




        private final FakestoreCategoryApi fakeStoreCategoryApi;

        public FakeStoreCategoryGateway(FakestoreCategoryApi fakeStoreCategoryApi) {
            this.fakeStoreCategoryApi = fakeStoreCategoryApi;
        }




    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // 1. Make the HTTP request to the FakeStore API to fetch all categories
        List<String> response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();

        // 2. Check if the response is null and throw an IOException if it is
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

         return GetAllCategoriesMapper.toCategoryDto(response);


        // 3. Map the response to a list of CategoryDTO objects
//        return response.getCategories().stream()
//                .map(category -> CategoryDTO.builder()
//                        .name(category)
//                        .build())
//                .toList();

//        return response.getCategories().stream()
//                .map(category -> {
//                    CategoryDTO dto = new CategoryDTO();
//                    dto.setName(category);
//                    return dto;
//                })
//                .toList();





    }
}
