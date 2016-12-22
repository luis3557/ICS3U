package GettingTheGame;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;


import hsa_new.Console;      
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class GettingTheGame {

	public static void main(String[] args) {



		String y;
		String n;
		String answer;

		
		
		Console c = new Console(); 
		try {
			Clip music = null;
			try {
				music = AudioSystem.getClip();
			} catch (LineUnavailableException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				music.open(AudioSystem.getAudioInputStream(new File("sounds/alarmclock.mp3")));
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			c.println("your alarm clock is ringing do you hit the snooze button?  (y/n)");
			answer = c.readLine();
			BufferedImage Img = ImageIO.read(new File ("alarmclock.png"));


			if (answer.equalsIgnoreCase("n")){
				c.println("you hear on the news that a video game has been released, you rush out to buy the game, do you drive pass the speed limit? (y/n)");
				BufferedImage wakeLate = ImageIO.read(new File ("Img/wakeuplate.png"));
				music.stop ();
				answer=c.readLine();
				if (answer.equalsIgnoreCase("y")){
					c.println("you crash");
					try {
						music.open(AudioSystem.getAudioInputStream(new File("sounds/carcrash.mp3")));
					} catch (LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedAudioFileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					BufferedImage crash = ImageIO.read(new File ("carcrash.jpg"));
					try {
						music.open(AudioSystem.getAudioInputStream(new File("sounds/Traffic.mp3")));
					} catch (LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedAudioFileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{ 
					c.println("do you want take the higway? (y/n)");
					answer = c.readLine();
					if ( answer.equalsIgnoreCase ("n")){
						c.println("there is traffic");
						try {
							music.open(AudioSystem.getAudioInputStream(new File("sounds/Traffic.mp3")));
						} catch (LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (UnsupportedAudioFileException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						BufferedImage gettingTheGame = ImageIO.read(new File ("traffic.jpg"));
						music.stop ();
					}
					else if (answer.equalsIgnoreCase("y")){

						c.println("someone on the street offer the game do you buy it? (y/n)" );
						BufferedImage fakeGame = ImageIO.read(new File ("Img/fakegame.jpg"));
						answer = c.readLine();
						if ( answer.equalsIgnoreCase ("y")){
							c.println("you bought a fake copy of the game");
						}

						else if(answer.equalsIgnoreCase("n")){
							c.println("you finally arrive at the parking lot do you turn right?(y/n)");
							BufferedImage img2 = ImageIO.read(new File ("src/gettingthegame.Img/leftoright.jpg"));
							answer = c.readLine();
							if ( answer.equalsIgnoreCase ("y")){
								c.println("the parking lot on the right is packed");
								BufferedImage img3 = ImageIO.read(new File ("Img/fullparkinglot.jpg"));
							}
							else if (answer.equalsIgnoreCase("n")){
								c.println("you parked your car and finally bought the game, you win!");
								BufferedImage parkingLot= ImageIO.read(new File ("Img/emptyparkinglot.jpg"));
								try {
									music.open(AudioSystem.getAudioInputStream(new File("sounds/victory.mp3")));
								} catch (LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (UnsupportedAudioFileException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}

				}

			}else if(answer.equalsIgnoreCase("y")){
				c.println("you finally wake up and realize that a video game has been released, you rush out to buy the game do you drive over the speed limit? (y/n)");
				answer = c.readLine();
				if (answer.equalsIgnoreCase("y")){
					c.println("you got caught by the police");
					try {
						music.open(AudioSystem.getAudioInputStream(new File("sounds/Policesiren.mp3")));
					} catch (LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnsupportedAudioFileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					music.stop ();
				}
				else if (answer.equalsIgnoreCase("n")){
					c.println("your stomach grumbles as you become more hungry, you arrive at a resturant; do you eat up soup? (y/n)? ");{
						answer = c.readLine();
					}
					if (answer.equalsIgnoreCase("n")){
						c.println("you decided to eat a sandwich which had food poisioning and die ");
					}
					else if(answer.equalsIgnoreCase("y")){
						c.println("you decided to eat the soup which had laxatives and you take too long");
					}	
				}
				
			
				
				}
			

		}catch(IOException e) {
			}
		
			}
		}


	
	







public class dsfsadf {

}
