
import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	
	{
	
            int n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("enter number");
	   
            n=sc.nextInt();
 
	    for(int i=1;i<=n;i++)
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("fact="+fact);
 
	}
 
}