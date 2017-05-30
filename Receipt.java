import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day, month;
		int date, year, location, actNum, atmLoc;
		double transAmt, actBal;
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it?");
			day = sc.nextLine();
		System.out.println("What is the month?");
			month = sc.nextLine();
		System.out.println("What is the date in numbers?");
			date = sc.nextInt();
		System.out.println("What is the year?");
			year = sc.nextInt();
		System.out.println("What is the Atm location?");
			atmLoc = sc.nextInt();
		//Continue to output
		
		
		System.out.println("+--------------------------------------+");
		System.out.println("|      Java Bank ATM Receipt           |");
		System.out.println("|      " + day + "," + " "+ month + " "+ date + ", " + year + " " + "    |");
		System.out.println("|      ATM Location # "+ atmLoc + "              |");
		System.out.println("|                                      |");
		System.out.println("|                                      |");
		System.out.println("|      Account Number:      1234567    |");
		System.out.println("|      Customer:     John Q. Public    |");
		System.out.println("|      Transaction Type:    Deposit    |");
		System.out.println("|      Transaction Amount:  $500.00    |");
		System.out.println("|      Account Balance:   $1,500.00    |");
		System.out.println("|                                      |");
		System.out.println("|      Thank you for banking with us   |");
		System.out.println("|            Have a coffee day         |");
		System.out.println("|                                      |");
		System.out.println("+--------------------------------------+");
		
	}	
}
