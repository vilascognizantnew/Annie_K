import java.util.Scanner;
public class SWapTwoVariable {
 public static void main(String[] args) {
   int a, b, c;
   Scanner in = new Scanner(System.in);

   System.out.println("first number: ");
   a = in.nextInt();
   System.out.println("second number: ");
   b = in.nextInt();

   c = a;
   a = b;
   b = c;

   System.out.println("Swapping the number gives:" + a + " and " + b);
  }
}