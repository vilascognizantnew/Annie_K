import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		int r;
	   Float area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		r=sc.nextInt();
		
		area=(float) (3.14*r*r);
		System.out.println("The Area of the Circle is :"+ " "+ area);
		

	}

}
