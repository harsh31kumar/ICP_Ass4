//  Write a java program that takes an integer N from user, uses
//  Math. Random () to print N random integer numbers between 1 to N, and then prints their
//  average value. Use do while loop.


import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. :");
		n=sc.nextInt();
		int i=1;
		double sum=0;
		System.out.println("Random No. generated are :");
		
		do
		{
			int random=1+(int)(n-1*Math.random());
			sum=sum+random;
			System.out.println(random+"");
			i++;
		}
		while(i<=n);
		
		double avg=sum/n;
		System.out.println("Average of "+avg+"random no. are");

	}

}
