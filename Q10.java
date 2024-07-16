//  Write a java program to print largest power of three less than or equal to N.


import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer no.");
		num=sc.nextInt();
		int pow=1;
		while((pow*3)<=num)
		{
			pow=pow*3;
		}
		System.out.println("The largest power of 3 is less than or equal to"+num+"is"+pow);

	}

} 
