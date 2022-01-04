package com.xworkz.PowerBank.DTO;

public class PowerBankDto {
	private String brand;
	private String colour;
	private int mah;
	private int price;
	public PowerBankDto(String brand, String colour, int mah, int price) {
		this.brand = brand;
		this.colour = colour;
		this.mah = mah;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMah() {
		return mah;
	}
	public void setMah(int mah) {
		this.mah = mah;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
