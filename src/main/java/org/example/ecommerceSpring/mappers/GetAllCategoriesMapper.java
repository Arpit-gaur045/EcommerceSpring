package org.example.ecommerceSpring.mappers;

import org.example.ecommerceSpring.dto.CategoryDTO;

import java.util.List;

public class GetAllCategoriesMapper {


    public static List<CategoryDTO> toCategoryDto(List<String> result){

        return result.stream()
                .map(category -> {
                    CategoryDTO dto = new CategoryDTO();
                    dto.setName(category);
                    return dto;
                })
                .toList();
    }
}
