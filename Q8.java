//  Write a program that generates a random integer number between 1 to 10 and asks the user to 
//  guess what the number is. If the user's guess is higher than the random number, the program 
//  should display "Too high, try again." If the user's guess is lower than the random number, the 
//  program should display "Too low, try again." The program should use a loop that repeats until 
//  the user correctly guesses the random number and display good guess


import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rn=0;
		int max=10;
		int min=1;
		int ug;
		do
		{
			rn=(int)(Math.random()*(max-min+1)+min);
			System.out.println("Enter your guess :");
		    ug=sc.nextInt();
			System.out.println("Computer guess: "+rn);
			System.out.println("USer guess: "+ug);
			if(ug>rn)
			{
				System.out.println("Too high, try again");
			}
			else if(ug<rn)
			{
				System.out.println("Too low, try again");
			}
			else
			{
				System.out.println("Good guess");
			}
			
		}while(ug!=rn);
		sc.close();

	}

}
