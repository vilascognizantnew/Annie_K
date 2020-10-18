import java.util.Scanner;

public class NaturalNumber 
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
}