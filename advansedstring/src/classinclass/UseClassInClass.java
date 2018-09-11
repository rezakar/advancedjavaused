package classinclass;

import java.lang.reflect.Constructor;

public class UseClassInClass {
	public static void getClassInClass() {
		Cars c = new Cars ();
		c.setCarName(EnumCarsNames.BENZ);
		c.setCarColor(EnumCarsColors.BLACK);
		Class<?> c1 = c.getClass();
		System.out.println(c1);
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		
		Constructor<?>[] constructor = c1.getConstructors();
		System.out.println("Number of constructor:" + constructor.length);
		
		Constructor<?> con = constructor[0];
		
		Object obj = null;
		try {
			obj = con.newInstance(EnumCarsNames.BMW , EnumCarsColors.BLACK);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	

}
