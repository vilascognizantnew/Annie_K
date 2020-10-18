import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int i;
		int n = 0;
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		i= sc.nextInt();
		while(i>0) {
			n=i%10;
			 sum=sum+n;
			i=i/10;
			
			 
			
			
			
			
		}
		
		 System.out.println("Sum 0f the Digits is:"+ sum);
	}

}
