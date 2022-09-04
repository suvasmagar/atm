import java.util.ArrayList;
import java.util.Scanner;

public class FirstBank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<>();
		System.out.println("Welcome to FirstBank!");
		System.out.println("Please create an account.");
		System.out.println("");
		for(int i=0; i<10; i++) {
			String name;
			String id;
			System.out.println("Enter name: ");
			name = scanner.nextLine();
			System.out.println("Enter ID: ");
			id = scanner.nextLine();
			System.out.println();
			Account account = new Account(name, id);
			list.add(account);
			System.out.println("Do you want to add more users? (y/n)");
			String option = scanner.nextLine();
			if(option.equals("n")) {
				break;
			}
		}

		for(int ai=0; ai<5; ai++)
		{
			System.out.println("Do wanna know your account balance? (y/n)");
			String option = scanner.nextLine();
			if(option.equals("y")) {
				for(int i=0; i<5; i++) {
					System.out.println("Enter ID: ");
					String id = scanner.nextLine();
					for(int j=0; j<list.size(); j++) {
						if(list.get(j).customerID.equals(id)) {
							list.get(j).showMenu();
						}
						
					}
					System.out.println("Do you want continue (y/n)");
					String options = scanner.nextLine();
					if(options.equals("n")) {
						break;
					}
				}
			}
			System.out.println("Thank you for using FirstBank!");
			break;
		}
	}
}