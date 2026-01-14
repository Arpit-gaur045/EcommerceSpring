package org.example.ecommerceSpring.gateway;
import org.example.ecommerceSpring.dto.CategoryDTO;
import org.example.ecommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.example.ecommerceSpring.mappers.GetAllCategoriesMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;
import java.util.List;



@Component("fakeStoreRestTemplateGateway")
public class FakeStoreRestTemplateGateway implements ICategoryGateway {

    private final RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {

        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakeapi.net/products/categories";

        ResponseEntity<List> response =  restTemplate.getForEntity(url, List.class);
        if (response.getBody() == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        List<String> result = response.getBody();

        return GetAllCategoriesMapper.toCategoryDto(result);
    }

//        RestTemplate restTemplate = new RestTemplate();
//        String fooResourceUrl
//                = "https://fakeapi.net/products/categories";
//        ResponseEntity<String> response
//                = restTemplate.getForEntity(fooResourceUrl , String.class);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(
//                response.getBody(),
//                new TypeReference<List<String>>() {}
//        );
    }

