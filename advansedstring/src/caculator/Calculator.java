package caculator;

import java.util.Scanner;

public class Calculator {
	public static void getNumber() {
		
		Scanner uinput = new Scanner(System.in);
		System.out.println("enter a numeric valu:");
		String n1 = uinput.next();
		System.out.println("enter seconde numeric valu:");
		String n2 = uinput.next();
		System.out.println("enter a Operations like (/*-+):");
		String op = uinput.next();
		double result = 0;
		switch (op) {
		case "+":
			result = MathHelper.addvalue(n1, n2);
			break;
		case "-":
			result = MathHelper.subtractionvalues(n1, n2);
			break;
		case "*":
			result = MathHelper.multiplyvalue(n1, n2);
			break;
		case "/":
			result = MathHelper.devidevalue(n1, n2);
			break;

		default:
			System.out.println("The operation is not valid!");
			break;
		}
		System.out.println("result is:" + result);
		
		
		
	}
	//check input with assert just add this command after you get string in up: assert.checkInput(s1);
	private static boolean checkInputre(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
		
	}
	


