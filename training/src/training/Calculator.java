package training;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Arithmetic Operator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition 	: "+ (a+b));
		System.out.println("Subtraction 	: "+ (a-b));
		System.out.println("Multiplication	: "+ (a*b));
		System.out.println("Division	: "+ (a/b));
	}

}
