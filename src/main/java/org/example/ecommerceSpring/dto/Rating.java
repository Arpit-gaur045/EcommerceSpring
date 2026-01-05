package org.example.ecommerceSpring.dto;

public class Rating{
	private Object rate;
	private int count;

	public void setRate(Object rate){
		this.rate = rate;
	}

	public Object getRate(){
		return rate;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}
}
