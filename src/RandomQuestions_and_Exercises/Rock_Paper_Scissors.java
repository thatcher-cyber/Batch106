package RandomQuestions_and_Exercises;

import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		String choice[]= {"rock","paper","scissors"};
		System.out.print("Your turn(rock,paper,scissors): ");
		String user=sc.next();
		System.out.print("Computer turn: ");
		String computer = choice[random.nextInt(choice.length)];
		if(user==computer) {
			System.out.print("It's a tie!");
		}
		
		
	}

}
