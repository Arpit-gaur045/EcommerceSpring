package org.example.ecommerceSpring.entity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity {

//    private String image;
//    private String color;
//    private int price;
//    private String description;
//    private int discount;
//    private String model;
//    private Long id;
//    private String title;
//    private Long categoryId;
//    private String brand;
//    private boolean popular;
    private String image;
    private int price;
    private String description;
    private String title;
    private String category;
    private int stock;
    private String brand;


}
