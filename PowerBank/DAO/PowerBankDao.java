package com.xworkz.PowerBank.DAO;

import com.xworkz.PowerBank.DTO.PowerBankDto;

public class PowerBankDao {
	public PowerBankDao() {
		System.out.println("inside powerbank DAO");
	}

	public void displayPowerBankDao(PowerBankDto dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getColour());
		System.out.println(dto.getMah());
		System.out.println(dto.getPrice());
	}

	public PowerBankDto createPowerBank(String brand, String colour, int mah, int price) {
		System.out.println("inside create method");
		PowerBankDto powerBankDto = new PowerBankDto(brand, colour, mah, price);
		return powerBankDto;
	}
	
	public PowerBankDto updatePowerBank(PowerBankDto obj,int newprice) {
		System.out.println("update methode");
		obj.setPrice(newprice);
		return obj;
	}
}
