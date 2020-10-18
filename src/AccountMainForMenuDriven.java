import java.util.Scanner;

public class AccountMainForMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAXACCOUNTS = 100;

		int noOfAcountsCreated = 0, choice = 0, accountId = 0;
		// Below Statements Create Array For Account
		// But Each Elements in Array Become The Reference Only Means Not Objects
		Account acc[] = new Account[MAXACCOUNTS];
		do {
			System.out.println("1:Create Account" + "\n2:Withdraw" + "\n3:Deposit" + "\n4Transfer" + "\n5Search Account"
					+ "\n6Display All" + "\n7Exit");
			System.out.println("Please Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Bal");
				double bal = sc.nextDouble();
				acc[noOfAcountsCreated] = new Account(++accountId, name, bal);
				System.out.println(acc[noOfAcountsCreated]);
				noOfAcountsCreated++;
				break;

			case 2:
				System.out.println("Do Withdraw");
				System.out.println("Enter Id");
				int id = sc.nextInt();
				for (int i = 0; i < noOfAcountsCreated; i++) {
					if (acc[i].getId() == id) {
						System.out.println("Enter Amount To Withdraw");
						double amt = sc.nextDouble();
						if (acc[i].withdraw(amt)) {
							System.out.println("Withdraw Successful");
						}
						break;
					}

				}
				break;
			case 3:
				System.out.println("Do Create Account");
				break;
			case 4:
				System.out.println("Do Create Account");
				break;
			case 5:
				System.out.println("Search ");
				System.out.println("Enter Id");
				id = sc.nextInt();
				for (int i = 0; i < noOfAcountsCreated; i++) {
					if (acc[i].getId() == id) {
						System.out.println(acc[i]);

						break;
					}

				}
				break;
			case 6:
				System.out.println("Search ");

				for (int i = 0; i < noOfAcountsCreated; i++) {
					System.out.println(acc[i]);

				}
				break;

			case 7:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");

			}

		} while (true);

		// sc.close();

	}

}
