import java.util.Scanner;

public class Account {
	//Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Class constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	//Function for Depositing money
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Function for Withdrawing money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//Function showing the previous transaction
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}
	
	//Function calculating interest of current funds after a number of years
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, you balance will be: " + newBalance);
	}
	
	//Function showing the main menu
	void showMenu() {
		int option ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Check your balance");
		System.out.println("2. Make a deposit");
		System.out.println("3. Make a withdrawal");
		System.out.println("4. View previous transaction");
		System.out.println("5. Calculate interest");
		System.out.println("6. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			option = scanner.nextInt();
			// System.out.println();
			
			switch(option) {
			//Case '1' allows the user to check their account balance
			case 1:
				
				System.out.println("Balance = $" + balance);
				
				System.out.println();
				break;
			//Case '2' allows the user to deposit money into their account using the 'deposit' function
			case 2:
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			//Case '3' allows the user to withdraw money from their account using the 'withdraw' function
			case 3:
				System.out.println("Enter an amount to withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			//Case '4' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
			case 4:
				
				getPreviousTransaction();
				
				System.out.println();
				break;
			//Case '5' calculates the accrued interest on the account after a number of years specified by the user
			case 5:
				System.out.println("Enter how many years of accrued interest: ");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
			//Case '6' exits the user from their account
			case 6:
				
				break;
			//The default case let's the user know that they entered an invalid character and how to enter a valid one
			default:
				System.out.println("Error: invalid option. Please enter 1, 2, 3, 4 or 5 access services.");
				break;
			}
		} while(option != 6);
		System.out.println("Thank you for banking with us!");
	}
	
}
