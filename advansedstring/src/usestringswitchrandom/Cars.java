package usestringswitchrandom;

public class Cars {
	public String carName;
	public long carColor = 0x000000;
	
	
	public Cars() {
		
	}
	
	
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
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
