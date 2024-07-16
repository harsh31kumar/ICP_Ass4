//  Write a java program to print the sum of all even numbers and the product of all odd numbers 
//  from 1 to N. Where, N is the input to the program.


import java.util.Scanner;
public class QH4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a= sc.nextInt();
        int sum=0;
        int sum1=1;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                sum+=i;
            }
           else {
                sum1*=i;
            }
        }
        System.out.println("Sum of all even numbers is "+sum+"\nProduct of all odd numbers is "+sum1);

	}

}
