package org.example.ecommerceSpring.dto;

public class CategoryDTO {

    private String name;

    // No-args constructor
    public CategoryDTO() {
    }

    // All-args constructor
    public CategoryDTO(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
