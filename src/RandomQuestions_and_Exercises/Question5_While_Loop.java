package RandomQuestions_and_Exercises;

import java.util.Scanner;

public class Question5_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int fnum=sc.nextInt();
		System.out.print("Enter second number(number to be raise): ");
		int snum=sc.nextInt();
		int value=1;
		int i=1;
		while(i<=snum)
		{
			value*=fnum;
			i++;
		}
		System.out.print("The value: "+value);
	}

}
