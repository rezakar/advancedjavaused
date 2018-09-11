package classinclass;

public enum EnumCarsColors {
	BLACK("black"), GREEN("green"), GOLD("gold"), YELLOW("yellow");
	
	private String carscolors;
	private EnumCarsColors(String carscolors) {
		this.carscolors = carscolors;
	}
	@Override
	public String toString() {
		return this.carscolors;
	}

}
