package estrada;

import java.util.Scanner;
/**
 *Luis Estrada
 *TestScpre.java
 *September 02
 *Prompts the user for the percentage earned on a test 
 */

public class TestScore {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int testscore;
        char  grade = 'F';
        
        System.out.println("Enter the porcentage");	
        testscore=scan.nextInt();
		{
		if (testscore >=90)
		 grade = 'A';
	
		else if (testscore >=80)
			grade = 'B';
		else if (testscore >=70)
		grade = 'C';
		
		else if (testscore >=60)
         grade = 'D';
		
		else if (testscore<60)
			grade = 'F'; 
		
		System.out.println("The corresponding letter grade is :"+grade);
	
				
	}

}
}
