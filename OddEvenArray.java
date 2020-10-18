import java.util.Scanner;
 
public class OddEvenArray {
    public static void main(String args[]) {
        int a, max, min, i;
        int[] inputArray = new int[100];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        a = in.nextInt();
        System.out.println("Enter " + a + " elements");
        System.out.println("Odd Numbers:");  
        for(int i=0;i<a.length;i++){  
        if(a[i]%2!=0){  
        System.out.println(a[i]);  
        }  
        }  
        System.out.println("Even Numbers:");  
        for(int i=0;i<a.length;i++){  
        if(a[i]%2==0){  
        System.out.println(a[i]);  
        
        
        
        
        
        
        
    }