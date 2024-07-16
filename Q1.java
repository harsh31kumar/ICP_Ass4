//  Write a java program that gets three integer numbers from the user. Count from the first number 
//  to the second number increments by the third number. Use for loop to do it. Also, display the 
//  sum of numbers displayed between the first number and second number.


import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,third;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First , Second , Third no.");
		first = sc.nextInt(); 
		second = sc.nextInt();  
		third = sc.nextInt(); 
		int sum=0;
		for (; first<=second ; first= first+third)
		{
			System.out.println(first + " ");
			sum=sum+first;
			
		}
		System.out.println("The sum is "+sum);

	}

}
