//Evan White
import java.util.Scanner;
public class IfExamEW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Score on exam 1: ");
		int score1 = input.nextInt();
		
		System.out.println("Score on exam 2: ");
		int score2 = input.nextInt();
		
		if(score1 >= 90 && score2 >= 90)
	System.out.println("Exempt All");
		
		else if(score1 >= 90 || score2 >= 90)
	System.out.println("Exempt One");
	
		else if(score1 < 90 && score2 < 90)
	{
			System.out.println("Exempt None");
	}
		
	}

}

/*
Score on exam 1: 
90
Score on exam 2: 
90
Exempt All
*/