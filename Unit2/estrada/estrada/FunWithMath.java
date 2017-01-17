package estrada;

import java.util.Scanner;

public class FunWithMath {
	/**
	 *Luis Estrada
	 *FunWithMath.java
	 *17/01/2017
	 * It let the user to add, subtract,multiply and divide
	 */


	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);


		int num1;
		int num2;
		String add;
		String subtract;
		String multiply;
		String divide;
		String total;

		System.out.println("Enter two numbers");
		String getnum1= scan.nextLine();
		String getnum2= scan.nextLine();

		System.out.println("Do you want add,subtracts, multiply and divide them.");
		total=scan.nextLine();
	}

	public static void subtract (int num1,int num2){

		int total = num1 - num2;
		System.out.println((total));

	}


	public static void multiply(int num1,int num2){

		int total = num1 * num2;
		System.out.println(total);

	}


	public static void divide(int num1,int num2){

		int total = num1 / num2;
		System.out.println(total);

	}


	public static void add(int num1,int num2){

		int total = num1 + num2;
		System.out.println(total);

	}






}











