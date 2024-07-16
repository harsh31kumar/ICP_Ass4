//  Write a Java program to check if a number is perfect number or not. 
//  (Hints: A number N is called perfect number, if the sum of factors except N as a factor is 
//  equals to the number N. 
//  Example:
//  N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)


import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
		int i=1;
		int s=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				System.out.print(i+ " ");
				s=s+i;
			}
			i++;
		}
		System.out.println();
		if(s==n)
		
			System.out.println(n+" is a perfect number.");
		
		else
			System.out.println(n+" is a perfect number.");


	}

}
