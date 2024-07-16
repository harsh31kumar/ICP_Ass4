//  Write a java program to find the difference between the sum of the squares of the first ten
// natural numbers and the square of the sum.


public class QH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum=0;
		
		for(int i=1;i<=10;i++) {
		    sum1+=i*i;
			sum+=i;
		}
		int sum2=sum*sum;
		System.out.println("The sum of the sq. of first ten natural no. is "+sum1);
		System.out.println("The sq. of the sum of the first ten natural no. is "+sum2);
		System.out.println("Hence the diff b/w the sum of the sq. of first ten natural no. and the sq. of the sum is "+((sum2)-sum1));
		
	}

}

