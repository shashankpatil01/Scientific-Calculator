package Calculator.controller;

import java.util.Scanner;

public abstract class Calculator {

	public abstract void Add();
	public abstract void Sub();
	public abstract void Mult();
	public abstract void Div();
	public abstract void Sq();
	public abstract void Sqrt();
	public abstract void Mod();
	public abstract void Exp();
	public abstract void Cbrt();

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator_Info();

		while (true) {

			try {
				Thread.sleep(200);

				System.out.println("********** Scientific Calculator **********");
				Thread.sleep(200);
				System.out.println("Press 1 for Addition");
				Thread.sleep(200);
				System.out.println("Press 2 for Subtraction");
				Thread.sleep(200);
				System.out.println("Press 3 for Multiplication");
				Thread.sleep(200);
				System.out.println("Press 4 for Division");
				Thread.sleep(200);
				System.out.println("Press 5 for Square");
				Thread.sleep(200);
				System.out.println("Press 6 for Squareroot");
				Thread.sleep(200);
				System.out.println("Press 7 for Modulus");
				Thread.sleep(200);
				System.out.println("Press 8 for Exponents");
				Thread.sleep(200);
				System.out.println("Press 9 for Cuberoot");
				Thread.sleep(200);
				System.out.println("Press Any number to Exit");
				Thread.sleep(200);
				System.out.println("---------------------------------------------");

			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Select The Operation You Want To Perform");
			System.out.print("-> ");
			int choice = sc.nextInt();
			if (choice < 1 || choice > 9) {
				System.out.println("Thank you for using the calculator !!");
				break;
			}

			switch (choice) {

			case 1: {
				calc.Add();

				break;
			}
			case 2: {
				calc.Sub();

				break;
			}
			case 3: {
				calc.Mult();
				break;
			}

			case 4: {
				calc.Div();
				break;
			}
			case 5: {
				calc.Sq();
				break;
			}
			case 6: {
				calc.Sqrt();
				break;
			}
			case 7: {
				calc.Mod();
				break;
			}
			case 8: {
				calc.Exp();
				break;
			}
			case 9: {
				calc.Cbrt();
				break;
			}

			default:
				System.out.println(" Please Enter valid Choices");

			}

		}
	}
}