
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1=new Account(101,"Ram",2000);
		Account acc2=new Account(102,"Shyam",2500);
		System.out.println(acc1);
		System.out.println(acc2.toString());
		System.out.println("Withdraw 1500 From Acc1");
		if(acc1.withdraw(1500))
		{
			System.out.println("Successfully Withdraw");
		}
		
		if(acc1.transfer(200,acc2))
		{
			System.out.println("Successfully Transfered");
			System.out.println(acc1.toString());
			System.out.println(acc2.toString());
		}
		
		
		

	}

}
