package bankingsimulation;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account(123,"Dhanush y shetty",1234567890.0);
		
		System.out.println("Welcome,"+ account.getName() + "!");
		
		while (true) {
			System.out.println("Bank Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. check balance");
			System.out.println("4. exit");
			System.out.println("enter your choice:");
			
			
			
			try {
				 int choice = scanner.nextInt();
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				
				int choice;
				switch(choice) {
				case 1:
					System.out.println("Enter deposite amount: ");
					double depositeAmount = scanner.nextDouble();
					account.deposit(depositeAmount);
					break;
					
				case 2:
					System.out.println("Enter withdraw amount: ");
					double withdrawalAmount = scanner.nextDouble();
					account.deposit(depositeAmount);
					try {
						account.withdraw(withdrawalAmount);
					}catch(InsufficientBalance | ArithmeticException e){
						System.out.println("Error: "+ e.getMessage());
						
						
					}
					break;
				case 3:
					account.showBalance();
					break;
				case 4:
					System.out.println("thanks man its pleassure to have uou in Shetty's");
					scanner.close();
					return;
			    default:
			    	System.out.println("invalid choice");
				}
			}catch(InputMismatchException e) {
					System.out.println("Error:Invalid choice bro please enter the valid number !Come On!");
					scanner.nextLine();
				
			
	}

	}


}

	}


