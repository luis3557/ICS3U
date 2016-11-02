package estrada;

import java.util.Scanner;
/**
 *Luis Estrada
 *GradeDisplay .java
 *September 01
 *That prompts the user for the number of copies to print
 */

public class PrintPrices {



	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int copies;
		double price=0.00;



		System.out.println("Number of copies");
		copies=scan.nextInt();


		if (copies<=99){
			price=0.30;
		}
		else if (copies<=499){
			price= 0.27;
		}

		else if (copies<=1000){
			price= 0.26;
		}
		else if (copies <=1000){
			price=0.25;
		}

		System.out.println("Price per copies:"+price);
		System.out.println("Number of copies:"+(price*copies));


	}
}
