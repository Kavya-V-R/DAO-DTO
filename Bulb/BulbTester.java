package com.xworkz.Bulb;

import com.xworkz.Bulb.DAO.BulbDao;
import com.xworkz.Bulb.DTO.BulbDto;

public class BulbTester {
public static void main(String[] args) {
	BulbDao bulbDao = new BulbDao();
	BulbDto createBulbDto=bulbDao.createBulbDto(123, 500, 50, "bajaj", "white");
	bulbDao.diaplayBulbDto(createBulbDto);
}
}
