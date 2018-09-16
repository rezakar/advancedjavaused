package caculator;



public class MathHelper {
	public static double subtractionvalues(String n1 , String n2) {
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);
		double result = a -b;
		return result;
	}
	public static double addvalue(String n1 , String n2) throws NumberFormatException{
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);
		double result = a +b ;
		return result;
	}
	public static double multiplyvalue(String n1 , String n2) {
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);
		double result = a * b;
		return result;
	}
	public static double devidevalue(String n1 , String n2) {
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);
		double result = a/b;
		return result;
	}

}
