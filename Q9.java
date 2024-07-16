//  Write a java program to take an integer input from the user and print the input by removing all 
//  zeros. 


import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer no.");
		num=sc.nextInt();
		int idx=0;
		int newNum=0;
		while(num!=0)
		{
			int d=num%10;
			if(d!=0)
			{
				newNum=newNum+(int)(d*(Math.pow(10,idx)));
				idx++;		
			}
			num=num/10;
		}
		System.out.println("After removing 0 from the given no , the new number is"+newNum);


	}

}
