package estrada;

import java.util.Scanner;

public class Random2 {
	
	/**
	 *Luis Estrada
	 *Random2.java
	 *November 15
	 *
	 */
	

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);

		System.out.println("User");
		System.out.println("Computer");
		
		String name=scan.nextLine();

		int dice1= (int)(Math.random()*11)+2;
		int dice2= (int)(Math.random()*11)+2;

		if (dice1>dice2)
			System.out.println("User Won!");
			



		else if  (dice2>dice1)
			System.out.println("Computer Won!");

	}

}
