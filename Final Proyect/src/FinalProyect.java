import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import hsa_new.Console;

/**
 * 
 */

/**
 * Luis Estrada
 * 19/01/2017
 * FinalProyect.java
 * This porgram its a game of a maze you have to do the maze to survive on time
 * ICS3U
 */
class FinalProyect {
	

}


	public static void main(String[] args) {

		String left;
		String right;
		String yes;
		String No;
		String answer;
        String 	OpenBox;


		Console c = new Console(); 
		try {
			BufferedImage maze = ImageIO.read(new File ("Img/maze.jpg"));




			{

				c.println("Your are in a maze wiht a limit time, where you want go ?(left/right)");
				c.drawImage (maze.jpg, 0, 100, null); 
				answer = c.readLine();


				if (answer.equalsIgnoreCase("left")){
					c.println("There place is dark you want keep walking?(yes/no)");

					answer=c.readLine();
					if (answer.equalsIgnoreCase("yes")){

						c.println("You fell in a hole");	
						answer = c.readLine();
					}



					else{ 
						c.println("You see a big box would you open it? (yes/no)");
						answer = c.readLine();

						if ( answer.equalsIgnoreCase ("yes"))

					
					if   (OpenBox());
						}


			} else 

				c.println("You die");


		
				if (answer.equalsIgnoreCase("no")){
				
			
			c.println("You see two ways to go wich one you go?(left/right) " );
		}
		answer = c.readLine();
		if ( answer.equalsIgnoreCase ("left")){
			c.println("The left side it's the way long, the time is done");
		}

		else if(answer.equalsIgnoreCase("right")){
			c.println("You see a red ligths the end of the way do you want follow it?(yes/no)");
			answer = c.readLine();}
		if ( answer.equalsIgnoreCase ("yes")){
			c.println("That way its close.you lose time");


		}

		else if (answer.equalsIgnoreCase("no")){
			c.println("You finish the game on time. You won!!");
			answer=c.readLine();

		}
		else if(answer.equalsIgnoreCase("yes")){
			c.println("Do you want go right?(yes/no)");
			answer = c.readLine();
		}

		if (answer.equalsIgnoreCase("yes")){
			c.println("That the wrong way, you not gonna finish the game on time."); }
			
			
			}
		}



			   
		catch(Exception e) {
			System.err.println(e.getMessage());			

		}
	
	

		{




			public stratic static boolean OpenBox(){
			
			
				String[] boxobjects={"Spiders","Ants","Scorpions","Snakes","Treasure","Flower","Bunnyrabbit"};

				int random=

					{		if (random<=3)
							return false
						}
			}
		
					
				
							else { return true;
							
			}
		










