import java.util.Scanner;

public class CashWithdrawl {

	public static void main(String[] args) {
		
		
		int amt;
		int R2000=0;
		int R500=0;
		int R200=0;
		int R50=0;
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the amount");
		amt=sc.nextInt();
		
		while(amt> 2000) {
			
			R2000=amt/2000;
			amt=amt%2000;
			System.out.println("R2000:"+" "+ R2000);
			break;
			
		}
         while(amt> 500) {
			
			R500=amt/500;
			amt=amt%500;
			System.out.println("R500:"+" "+ R500);
			break;
			
		}
         while(amt> 200) {
 			
 			R200=amt/200;
 			amt=amt%200;
 			System.out.println("R200:"+" "+ R200);
 			break;
         
         }
         while(amt>50) {
   			
   			R50=amt/50;
   			amt=amt%100;
   			System.out.println("R50:"+" "+R50);
   		
 	}
         
}
}
 
 				
 			

 		
		
		
		
		
		



