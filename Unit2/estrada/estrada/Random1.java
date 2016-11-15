package estrada;

import java.util.Scanner;

/**
 *Luis Estrada
 *Random1.java
 *November 15
 * It tell the user if they like that name or not
 */
public class Random1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);

		System.out.println("Name");
		
		String name=scan.nextLine();

		int x= (int)(Math.random()*100)+1;


		if (x<=29)
			System.out.println("You don't like that name");
			



		else if  (x>=69)
			System.out.println("This is a your favoirite name");
	}

}
