package com.xworkz.PowerBank;

import com.xworkz.PowerBank.DAO.PowerBankDao;
import com.xworkz.PowerBank.DTO.PowerBankDto;

public class PowerBankTester {
	public static void main(String[] args) {

		System.out.println("inside the main method");
		PowerBankDao powerBankDao = new PowerBankDao();

		// PowerBankDto mi = new PowerBankDto("mi", "white", 5000, 2000);
		// powerBankDao.displayPowerBankDto(mi);

		PowerBankDto obj = powerBankDao.createPowerBank("realme", "blue", 10000, 2000);
		powerBankDao.displayPowerBankDao(obj);
		PowerBankDto mi = powerBankDao.createPowerBank("mi", "red", 10500, 3500);
		powerBankDao.displayPowerBankDao(mi);
		PowerBankDto syska = powerBankDao.createPowerBank("syska", "pink", 20000, 3000);
		powerBankDao.displayPowerBankDao(syska);

	}
}
