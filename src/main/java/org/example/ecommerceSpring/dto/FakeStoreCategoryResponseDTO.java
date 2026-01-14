package org.example.ecommerceSpring.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreCategoryResponseDTO {

    private List<String> categories;

    public List<String> getCategories() {
        return categories;
    }


}






