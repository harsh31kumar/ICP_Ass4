//  Write a java program to enter two numbers through the keyboard. Write a program to find the 
// value of one number raised to the power of another. (Do not use Java built-in method).


import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and power  numbers ");
		int base=sc.nextInt();
		double power=sc.nextDouble();
		long mul=1;
		for (int i=1;i<=power;i++)
		{
			mul=mul*base;
		}
		System.out.println( base +" to the power "+power+ " is "+ mul);
		

	}

}
