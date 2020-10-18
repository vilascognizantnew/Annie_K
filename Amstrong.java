import java.util.Scanner;

public class Amstrong
{
    public void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int orgNum = num;
        
        int cubeSum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            cubeSum = cubeSum + (digit * digit * digit);
            num /= 10;
        }
        
        if (cubeSum == orgNum)
            System.out.println(orgNum + " is an Armstrong number");
        else
            System.out.println(orgNum + " is not an Armstrong number");
    }
}