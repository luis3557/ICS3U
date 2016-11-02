package estrada;

import java.util.Scanner;

/**
 *Luis Estrada
 *GradeDisplay .java
 *October 31
 *ICS3U
 */

public class GradeDisplay {

	public GradeDisplay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int grade;
		
		{
		
			System.out.println("Enter your grade?");
			grade=scan.nextInt();
		
		}
		

		if (grade>90)
		{
			System.out.println("great job!");
			
			
		}

	}
	
