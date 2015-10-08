package eightBall;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		eightBall b=new eightBall();
		Scanner keyboard = new Scanner(System.in);
		String p="";
		while (!p.equals("n")){
		System.out.println("What is your question?");
		keyboard.nextLine();
		b.Generate();
		System.out.println("\nAsk another question? (y/n)");
		p=keyboard.nextLine();
		}
		System.out.println("\n\nClosing....");
		keyboard.close();
	}
}
