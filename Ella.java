import java.io.*;
import java.util.*;
import java.lang.*;

public class Ella{

	private static String [] phrases = new String [5];
	private static String name;
	private static String [] feel = new String [3];
	
	public Ella(String name){
		this.name=name;
	}
	
	public static void populate(){
		phrases[0] = "I'm doing great and you?";
		phrases[1] = "I'm feeling a bit off today!";
		phrases[2] = "none of your business";
		phrases[3] = "I'm Sad....";
		phrases[4] = "I feel wholesome...kinda like bread";
	}
	
	public static void feelings(){
		feel[0] = "I sense....You have the spirit of a dog! woof!!";
		feel[1] = "You remind me of the titanic...a big excuse to sink...lol!";
		feel[2] = "You remind me of my jeep..vrooooom! ah! feel the wind on my face!";
	}
	
	public static int randomWithRange(int min, int max){
		int range = Math.abs(max - min) + 1;     
		return (int)(Math.random() * range) + (min <= max ? min : max);
	}
	
	
	public static void main (String []arg){
		System.out.println("Hello I'm Ella! and you are?");
		Scanner in = new Scanner(System.in);
		String namer = in.nextLine();
		populate();
		feelings();
		
		if (namer.equalsIgnoreCase("Ella")){ System.out.println("oh wow! that's my name too!"); 
		}else System.out.println("hmm...your name is kinda boring. But anyway...");
		
		
		System.out.println("em... "+namer +"? wouldn't you like to know how I am?");
		String resp = in.nextLine();
		if (resp.equalsIgnoreCase("No")){
			System.out.println("FINE! then go away!");
			System.exit(0);
			}else if (resp.equalsIgnoreCase("maybe")){
				System.out.println(namer+(" it's not a hard question is it?? ... have a good think about it for a few seconds!"));
				try{
					Thread.sleep(10000);
				}catch (InterruptedException ex){
					Thread.currentThread().interrupt();
				}
				System.out.println("...Good! Now I'm sure you want to know how if feel so I'll tell you!");
			}
			
			 
		int rresp = randomWithRange(0,4);
		int rrepB = randomWithRange(0,2);
		
		
		System.out.println(namer +" "+phrases[rresp]);
		System.out.println(namer +" "+feel[rrepB]);
			
		
		System.exit(0);
	}
}
		
		
		
