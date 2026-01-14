package org.example.ecommerceSpring.gateway;


import org.example.ecommerceSpring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getAllCategories()throws IOException;
}
