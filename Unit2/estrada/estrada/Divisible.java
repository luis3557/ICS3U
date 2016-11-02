/** 
 * 
 */
package estrada;

import java.util.Scanner;
/**
 *Luis Estrada
 *Divisible.java
 *October 31
 *It takes an integer and then tests it to see if it is positive or negative and also tests it to see if it is divisible by 7. 
 */
public class Divisible {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int integer;
		
		
			
			
		
		System.out.println("Enter a integer");
		integer=scan.nextInt();
		
		
		
	
	
		if (integer % 7== 0)
			
		System.out.println("This integer is  divisible by 7");
		
		else 
		System.out.println("this integer is not divisible by 7");
		
		
	}
}	

		
	
