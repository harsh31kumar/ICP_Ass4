//  An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your 
//  program to determine whether or not the number is divisible by 9. Test it on the following 
//  numbers: Use while loop.


import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. :");
		num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
		int rem=num%10; 
		sum=sum+rem;
		num=num/10;
		}
		if(sum%9==-0)
			System.out.println("The No.is divisible by 9");
		else
			System.out.println("The No.is not divisible by 9");
			

	}

}
