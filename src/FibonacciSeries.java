import java.util.Scanner;
 
public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int n = sc.nextInt();
		
		int a = -1;
		int b = 1;
		int c = 0;
		
		System.out.println("The Series is : ");
 
		for(int i=1; i<=n; i++) {
			
			c = a + b;
			int temp = a;
			a = b;
			b = c;
			
			System.out.println(c);
		}
	}
}
