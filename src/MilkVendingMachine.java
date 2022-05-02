import java.util.Scanner;
public class MilkVendingMachine {
	
	static Scanner sc=  new Scanner(System.in);
	
	public static double  DisplayChoices() {
		double price = -1;
		
		System.out.println("well, this is what we have "); 
		System.out.println(" a : quarter a litre @ Ksh 15.00");
		System.out.println(" b : half a litre @ Ksh 30.00" );
		System.out.println(" c : one litre @ Ksh 60.00");
		System.out.println(" d : more than a litre @ more than Ksh 60.00");
		
		System.out.println("which package would you like to purchase ? choose a letter");
		String choice = sc.next();
		
		if(choice.equals( "a")) {
			price = 15;
			return 15;
			
		} else if (choice.equals("b")) {
			price = 30;
			return 30;
		
		} else if ( choice.equals("c")) {
			price = 60;
			return 60;
		} else if (choice.equals("d")) {
			System.out.println("how many litres do you want ? ");
			int Litres = sc.nextInt();
			price = 60 * Litres;
			return  60 * Litres;
	
		} else {
			return price;
		}
		
	}
	
	public static void dispense(double moneyInserted, double milkCost) {
		
		System.out.println("Should we continue with the transaction ? ");
		
		System.out.println("1 : yes");
		System.out.println("2 : no");
		String option = sc.next();
		if (option.equals("1")) {
		if (moneyInserted == milkCost) {
			System.out.println("vending.......");
			System.out.println("here is your milk, enjoy");
	         System.out.println("please come back soon and take care");
	         
		} else if(moneyInserted > milkCost) {
			System.out.println("vending....");
			System.out.println("here is your milk, enjoy");
			double change = moneyInserted - milkCost;
			System.out.println("here is your Ksh " + change + " in change");
			System.out.println("please come back soon and take care");
		} else {
			System.out.println("sorry the money you entered is too little, please top -up. Thank you");
		}
		}
		   
		else {
			System.out.println("here is your Ksh " + moneyInserted + " back");
			System.out.println("please come back soon. Thank you");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Ravens milk vending machine");
		System.out.println("we have the fresh unpasterized milk in town");
		
		System.out.println("how much money do you have ? ");
		double moneyInserted= sc.nextDouble();
		double milkCost = DisplayChoices();
		 dispense(moneyInserted, milkCost);

	}

}














