package org.example.ecommerceSpring.dto;

public class FakeStoreProductResponseDTO{
	private String image;
	private Specs specs;
	private Object price;
	private Rating rating;
	private String description;
	private int id;
	private String title;
	private String category;
	private int stock;
	private String brand;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSpecs(Specs specs){
		this.specs = specs;
	}

	public Specs getSpecs(){
		return specs;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setRating(Rating rating){
		this.rating = rating;
	}

	public Rating getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}
}
