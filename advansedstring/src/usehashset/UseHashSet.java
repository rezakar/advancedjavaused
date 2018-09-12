package usehashset;

import java.util.HashSet;

import classinclass.EnumCarsColors;

public class UseHashSet {
	
	public static void usehashSet() {
		Cars c1 = new Cars();
		Cars c2 = new Cars();
		c1.setCarColor(EnumCarsColors.BLACK);
		c1.setCarName(EnumCarsNames.BENZ);
		HashSet<Cars> hashset = new HashSet<>();
		hashset.add(c2);
		hashset.add(c1);
		System.out.println("there are "+ hashset.size() + " cars in the set");
		System.out.println(hashset);
		for (Cars cars : hashset) {
			System.out.println(cars.getCarColor() +" " + cars.getCarName());
		}
	}
	

}
