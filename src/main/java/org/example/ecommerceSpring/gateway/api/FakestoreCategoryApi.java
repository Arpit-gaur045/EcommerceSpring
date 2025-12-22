package org.example.ecommerceSpring.gateway.api;


import org.example.ecommerceSpring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

public interface FakestoreCategoryApi {

    @GET("/products/categories")
    Call<List<String>> getAllFakeCategories() throws IOException;
}
