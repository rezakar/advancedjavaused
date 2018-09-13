package uselinkedlist;



public class Cars implements Comparable<Cars>{
	public EnumCarsNames carName;
	public EnumCarsColors carColor;
	
	
	public Cars(EnumCarsNames carName, EnumCarsColors carColor) {
		this.carName = carName;
		this.carColor = carColor;
		
	}
	
	
	/*public EnumCarsNames getCarName() {
		return carName;
	}


	public void setCarName(EnumCarsNames carName) {
		this.carName = carName;
	}


	public EnumCarsColors getCarColor() {
		return carColor;
	}


	public void setCarColor(EnumCarsColors carColor) {
		this.carColor = carColor;
	}
*/

	


	@Override
	public int compareTo(Cars o) {
		String s1=this.getClass().getSimpleName();
		String s2 = o.getClass().getSimpleName();
		return s1.compareTo(s2);
	}


	public String toString() {
		return"car name: "+ this.carName+"  " + "car color: " + this.carColor;
	}
	

}
