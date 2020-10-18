
public class Account {	
	
	private int id;
	private String name;
	private double bal;
	private final double MINBAL=800;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public double getBal() {
		return bal;
	}




	public Account(int id, String name, double bal) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
	}
	
	
	
	
	public boolean deposit(double amt)
	{
		if(amt<100) {
			System.out.println("Amount Should Not Below 100");
			return false;
		}
		else if(amt%100==0) {
			bal=bal+amt;
			return true;
		}
		
		return false;
	}
	
	
	public boolean withdraw(double amt)
	{
		if(amt<100) {
			System.out.println("Amount Should Not Below 100");
			return false;
		}
		else if((bal-amt)<MINBAL)
		{
			System.out.println("Insufficient Bal To Withdraw");
			return false;
		}
		else if(amt%100==0 && !((bal-amt)<MINBAL)) {
			bal=bal-amt;
			return true;
		}
		
		return false;
	}
	
	public boolean transfer(double amt,Account account)
	{

		if(account==null) {
			System.out.println("Account Should Be Exist");
			return false;
		}
		else if(amt<100) {
			System.out.println("Amount Should Not Below 100");
			return false;
		}
		else if((bal-amt)<MINBAL)
		{
			System.out.println("Insufficient Bal To Withdraw");
			return false;
		}
		else if(amt%100==0 && !((bal-amt)<MINBAL)) {
			bal=bal-amt;
			account.bal=account.bal+amt;
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}
	
	
	
	
	
	
	

}
