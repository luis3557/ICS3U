import java.util.Scanner;

/**
 *Luis Estrada
 * ICS3U
 * ClassSchedule.java
 *Sep/20/2016
 */
public class ArithmeticExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;

		System.out.println("Please enter your number");

		number1 = scan.nextInt();
		number2 = scan.nextInt();
		number3 = scan.nextInt();
		number4 = scan.nextInt();
		number5 = scan.nextInt();

		System.out.println("total:"+(number1+number2+number3+number4+number5));
		System.out.println("Second number - Thrid number is:"+(+number2-number3));
		System.out.println("first number * fith number is:"+(+number1*number5));
		System.out.println("fourt number / second number is:"+(+number4/number2));
		System.out.println("fourt number % second number is:"+(+number4%number2));
		System.out.println("first numberaised to the power of the third number:"+(Math.pow(number1,number3)));
		System.out.println("square root of the fifth number:"+(Math.sqrt(number5)));





	}

}
