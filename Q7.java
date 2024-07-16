//  Write a java program to print the multiplication table of a number entered by the user.


import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		int x=sc.nextInt();
		int r=1;
		int i=1;
		while (i<=10) {
			r=i*x;
		
		System.out.println(x+"x"+i+"="+r);
		i++;
		}
	}
}
