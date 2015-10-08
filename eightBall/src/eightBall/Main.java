package eightBall;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Magic8BallRemembers b=new Magic8BallRemembers();
		
		Scanner keyboard = new Scanner(System.in);
		String q="",p="";
		while (!p.equals("n")){
		System.out.println("What is your question?");
		q=keyboard.nextLine();
		b.Remember(q);
		
		System.out.println("\nAsk another question? (y/n)");
		p=keyboard.nextLine();
		}
		System.out.println("\n\nClosing....");
		keyboard.close();
	}
	
}
