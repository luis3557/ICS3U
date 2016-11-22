package estrada;

import java.util.Scanner;

public class GuessingGame {

/**
 *Luis Estrada
 *GuessingGame.java
 *November 22
 *
 */


	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
	
		int usernumber;
		int computernumber;
		
		System.out.println("Enter a number between 1 and 20");
		usernumber=scan.nextInt();
		
		if (usernumber>0 || usernumber<20);
		{
			computernumber=(int)(Math.random()*20)+1;
			System.out.println("Computer number"+computernumber);
			
			System.out.println("User number"+usernumber);
			
			if (computernumber>usernumber){
				System.out.println("Better luck next time");
			}
				
				else
					
				
					System.out.println("You won");
				
				
				}
			
		}
		
		

	}


