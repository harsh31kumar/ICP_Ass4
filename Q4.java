//  Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's 
//  algorithm, which is an iterative computation based on the following observation: if y divides 
//  x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y


import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No. :");
		x=sc.nextInt();
		System.out.println("Enter Second No. :");
		y=sc.nextInt();
		int a=(x>y)? x:y;
		int b=(x<y)? x:y;
		System.out.println("GCD of"+x+" and"+y+ "is");
		while(a%b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		System.out.println(b);

	}

}
