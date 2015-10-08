package eightBall;
import java.util.ArrayList;

public class Magic8BallRemembers extends eightBall{
	private ArrayList<String> questions=new ArrayList<String>();
	public int l=0;
	public void Remember(String a){
		if (a.equals("history")){
			System.out.println("\nHistory:\n");
			for(int i=0;i<l;i++){
				System.out.println(questions.get(i));
			}
		}
		else
		{questions.add(a);
		l++;
		Generate();
		}
	}
}
