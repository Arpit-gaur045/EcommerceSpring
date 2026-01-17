package org.example.ecommerceSpring.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class FakeStoreProductResponseDTO{
	private String image;
	private Specs specs;
	private int price;
	private Rating rating;
	private String description;
	private int id;
	private String title;
	private String category;
	private int stock;
	private String brand;


}
