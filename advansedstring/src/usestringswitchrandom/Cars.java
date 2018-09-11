package usestringswitchrandom;

public class Cars {
	public EnumCarsNames carName;
	public long carColor = 0x000000;
	
	
	public Cars() {
		
	}
	
	
	public EnumCarsNames getCarName() {
		return carName;
	}


	public void setCarName(EnumCarsNames carName) {
		this.carName = carName;
	}


	public long getCarColor() {
		return carColor;
	}


	public void setCarColor(long carColor) {
		this.carColor = carColor;
	}


	/*public String toString() {
		return"carname: "+ this.carName+"  " + "car color: " + this.carColor;
	}*/
	

}
