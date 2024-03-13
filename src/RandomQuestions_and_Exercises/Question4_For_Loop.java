package RandomQuestions_and_Exercises;

import java.util.Scanner;

public class Question4_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find the factorial value of any number entered through the keyboard. 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		int fatvalue=1;
		for(int i=num; i>=1; i--)
		{
			fatvalue*=i;
		}
		System.out.print("Factorial value of the number: "+fatvalue);
	}

}
