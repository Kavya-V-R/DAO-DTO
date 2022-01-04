package com.xworkz.Bulb.DAO;

import com.xworkz.Bulb.DTO.BulbDto;

public class BulbDao {
	public BulbDao() {
		System.out.println("inside dao constructor");
	}

	public BulbDto createBulbDto(int serialNumber, int price, int volt, String brand, String colour) {
		System.out.println("inside the create method");
		BulbDto bulbDto = new BulbDto(serialNumber, price, volt, brand, colour);
		return bulbDto;
	}

	public void diaplayBulbDto(BulbDto dto) {
		System.out.println("inside the display method");
		System.out.println(dto.getSerialNumber());
		System.out.println(dto.getPrice());
		System.out.println(dto.getVolt());
		System.out.println(dto.getBrand());
		System.out.println(dto.getColour());

	}
}
