import java.util.Scanner;

public class LastIndexOfString
{
	public static void main(String[] arg)
	{
		String s;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the string : ");
		s=sc.nextLine();
		int index = 0;      

		index = s.lastIndexOf('l');         

		System.out.println("Last index is : " +index);
	}
}