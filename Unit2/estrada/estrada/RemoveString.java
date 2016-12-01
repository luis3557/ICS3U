package estrada;

import java.util.Scanner;

/**
 *Luis Estrada
 *RemoveString.java
 *November 29
 *	*
 */
public class RemoveString {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		String sentence;
		String string;
		
		
		
		System.out.println("Enter a sentence");
		sentence=scan.nextLine();
		System.out.println("Enter a string");
		string=scan.nextLine();
			
			System.out.println(sentence.replace(string, " "));
			
		
		  // System.outprintln(sentence.charAt(string));
   
		
			System.out.println("I hope you get and intierview.");

	}

}
