package main;

import java.util.ArrayList;

import usestringswitchrandom.Cars;

public class ApplicatioMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Cars c1 = new Cars();
		c1.setCarName("Benz");
		c1.setCarColor(0x00ff00);
		Cars c2 = new Cars();
		c2.setCarName("BMW");
		c2.setCarColor(0x02ff00);
		Cars c3 = new Cars();
		c3.setCarName("Hunda");
		c3.setCarColor(0x25ff00);
		ArrayList<Cars> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for (Cars cars : list) {
			System.out.println("car name :"+cars.carName+" "+" car color:"+cars.carName);
		}

	}

}
