package estrada;

import java.util.Scanner;


/**
 *Luis Estrada
 *PrimerFactor.java
 *November 23
 *	 *
 */
public class PrimeFactors {


	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		double number;
		System.out.println("Enter a number");
		number=scan.nextInt();
		
	int count = -2;
 
	while (count<=number){		
		if(number<=0){
		
		System.out.println(count);
		}
		
		else{
			count=count + 1;

		}
	}
	
	}
}	
			
		
			
			
		
	


