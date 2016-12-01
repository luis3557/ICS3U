package estrada;

import java.util.Scanner;

public class GroupAssingment {
	/**
	 *Luis Estrada
	 *GroupAssingment.java
	 *December 1
	 * it tell your group number
	 */

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		String lastName; 


		System.out.print("Enter you first name: ");

		System.out.print("Enter you last name: ");

		lastName = input.nextLine();


		switch (lastName.charAt(0)){ 

		case 'A': case'B': case'C': case 'D': case'E': case'F': case'G': case 'H':case 'I':
			System.out.println("Group 1");
		break;



		case 'J': case'K': case'L': case'M': case'N': case'O': case'P': case'Q': case'R': case'S': 

			System.out.println("Group 2");

		break;

		default:

			System.out.println("Group 3");
			break;

		}









	}

}
