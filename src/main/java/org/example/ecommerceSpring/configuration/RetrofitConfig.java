package org.example.ecommerceSpring.configuration;

import org.example.ecommerceSpring.gateway.api.FakeStoreProductApi;
import org.example.ecommerceSpring.gateway.api.FakestoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



    @Configuration
    public class RetrofitConfig {


        @Bean
        public Retrofit retrofit() {
            return new Retrofit.Builder()
                    .baseUrl("https://fakeapi.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        @Bean
        public FakestoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
            return retrofit.create(FakestoreCategoryApi.class);
        }

        @Bean
        public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
            return retrofit.create(FakeStoreProductApi.class);
        }

    }
