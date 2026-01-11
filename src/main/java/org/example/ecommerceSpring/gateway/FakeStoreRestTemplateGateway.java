package org.example.ecommerceSpring.gateway;


import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreRestTemplateGateway")
public class FakeStoreRestTemplateGateway implements ICategoryGateway {
    @Override
    public List<String> getAllCategories() throws IOException {
        return List.of();
    }
}
