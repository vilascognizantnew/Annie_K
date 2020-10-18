import java.util.*;
 
public class ArrayHighestLowest {
    public static void main(String args[]) {
        int count, max, min, i;
        int[] inputArray = new int[100];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements");
         
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
        }
   
        max = min = inputArray[0];
         
        for(i = 1; i < count; i++) {
            if(inputArray[i] > max)
                max = inputArray[i];
            else if (inputArray[i] < min)
                min = inputArray[i];
                
        }
        
        System.out.println("Highest Number : " + max);
        System.out.println("Lowest Number : " + min);
    }
}