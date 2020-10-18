import java.util.Scanner;
 public class UpperCase {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("Enter a String: ");
	 String line = in.nextLine();
	 line = line.toUpperCase();
	 System.out.println(line); 
	 }			
}