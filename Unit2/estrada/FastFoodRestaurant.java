import java.util.Scanner;

/**
 * 
 */

/**
 *Luis Estrada	
 *Date 06/10/2016
 *ICS3C
 *FastFoodRestaurant.java
 *
 */
public class FastFoodRestaurant {





	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);


		double burgers;
		double fries;
		double sodas;
		double tax;
		double subtotal;






		System.out.println("Enter the number of burgers:");
		burgers=scan.nextDouble();
		System.out.println("Enter the number of fries:");
		fries=scan.nextDouble();
		System.out.println("Enter the numbere of sodas:");
		sodas=scan.nextDouble();
		
		subtotal = (burgers*1.60+fries*1.09+sodas*0.99);
		;
		
		System.out.println("Total before tax:"+(subtotal));
		
		tax= (burgers*1.60+fries*1.09+sodas*0.99);
				
		System.out.println("Final total:"+(tax));
		
		tax=0.065;





	}

}
