package com.xworkz.Bulb.DTO;

public class BulbDto {
	private int serialNumber;
	private int price;
	private int volt;
	private String brand;
	private String colour;

	public BulbDto(int serialNumber, int price, int volt, String brand, String colour) {
		System.out.println("inside the bulb constructor");
		this.serialNumber = serialNumber;
		this.price = price;
		this.volt = volt;
		this.brand = brand;
		this.colour = colour;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
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

}
