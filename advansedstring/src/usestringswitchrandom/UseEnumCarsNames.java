package usestringswitchrandom;

import java.util.ArrayList;
import java.util.Random;

public class UseEnumCarsNames {
		public static void useEnumCars() {
			Cars c1 = new Cars();
			c1.setCarName(EnumCarsNames.BENZ);
			c1.setCarColor(0x00ff00);
			Cars c2 = new Cars();
			c2.setCarName(EnumCarsNames.BMW);
			c2.setCarColor(0x02ff00);
			Cars c3 = new Cars();
			c3.setCarName(EnumCarsNames.JEEP);
			c3.setCarColor(0x25ff00);
			ArrayList<Cars> list = new ArrayList<>();
			list.add(c1);
			list.add(c2);
			list.add(c3);
			for (Cars cars : list) {
				System.out.println("car name :"+cars.carName+" "+" car color:"+cars.carColor);
			}
			Random generator = new Random();
			int index = generator.nextInt(3);
			System.out.println("random value :" + index);
			Cars c = list.get(index);
			
			switch(c.carName) {
			case BENZ:
				System.out.println("it is German Car!");
				break;
			case BMW:
				System.out.println("it is Bavaria Car!");
				break;
			case HUNDA:
				System.out.println("it is Japonese Car!");
				break;
				default:
					System.out.println("I don't know where it's from!");
			}

		}


}
