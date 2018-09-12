package usehashset;

public enum EnumCarsNames {
	BENZ ("benz"), BMW("bmv") , HUNDA("hunda") , TOYOTA("toyota") , JEEP("jeep");
	private String carsenum;
	private EnumCarsNames(String carsenum) {
		this.carsenum = carsenum;
	}
	@Override
	public String toString() {
		return this.carsenum;
	}

}
