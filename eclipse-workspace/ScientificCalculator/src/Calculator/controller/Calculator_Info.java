package Calculator.controller;

import java.util.Scanner;

public class Calculator_Info extends Calculator {

	int num1;
	int num2;

	public void Add() {

		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double i = 1;

		System.out.println("Enter The Numbers : ");

		System.out.println("Press 0 after inputting the multiple values for result");
		try
		{
			while (i != 0) {
				i = sc.nextDouble();
				sum += i;
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation"+e);
		}
		
		System.out.println("Sum : " + sum);
	}

	public void Sub() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers : ");
		System.out.println("Press 0 after entering the values");

		int sub = 0;
		int k = 0;
		int i = 1;
		try 
		{
			while (i != 0) {
				i = sc.nextInt();
				if (k == 0) {
					sub = i;
					k++;
				} 
				else 
				{
					sub = sub - i;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation"+e);
		}
		
		System.out.println("Difference : " + sub);
	}

	public void Mult() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		System.out.println("Press 1 after entering the values");

		int mult = 1;
		int i = 0;
		try
		{
		while (i != 1) {
			i = sc.nextInt();
			mult = mult * i;

		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation"+e);
		}
		System.out.println("Multiplication for provided numbers is : " + mult);

	}

	public void Div() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter The Second Number : ");
		int num2 = sc.nextInt();
		double result=0;
		try 
		{
			result = Math.floorDiv(num1, num2);
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation "+e);
		}
		System.out.println("Division of the two numbers is "+ result);

	}

	public void Sq() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int n3=0;
		try {
		n3 = num1 * num1;
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation "+e);
		}
		
		System.out.println("Square of the numbers is : " + n3);

	}

	public void Sqrt() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int n = sc.nextInt();
		double result = 0;
		try {
			
		result = Math.sqrt(n);
		}
		catch(Exception e)
		{
			System.out.println("invalid arithmetic operation "+e);
		}
		System.out.println("Squareroot of the number is : " + result);

	}

	public void Mod() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter The Second Number : ");
		int num2 = sc.nextInt();
		try {
			double result = num1 % num2;
			System.out.println("The Modulus of the number is : " + result);
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation "+e);
		}
	}

	public void Exp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter The Second Number : ");
		int num2 = sc.nextInt();
		double result = 0;
		try {
		result = Math.pow(num1, num2);
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation "+e);
		}
		System.out.println("Exponents for the numbers is : " + result);

	}
	public void Cbrt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num1 = sc.nextInt(); 
		double result = 0;
		try {
			
		result = Math.cbrt(num1);
		}
		catch(Exception e)
		{
			System.out.println("Invalid arithmetic operation "+e);
		}
		System.out.println("Cube root of the number is : "+ num1);
	}

}
