package usehashset;

import classinclass.EnumCarsColors;

public class Cars {
	public EnumCarsNames carName;
	public EnumCarsColors carColor;
	
	
	public Cars() {
		
	}
	
	
	public EnumCarsNames getCarName() {
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


	/*public String toString() {
		return"carname: "+ this.carName+"  " + "car color: " + this.carColor;
	}*/
	

}
