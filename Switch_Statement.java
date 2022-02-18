package application1;
import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String days;
		System.out.print("please Enter Your Day: ");
		days = scanner.next();
		switch (days) {
		case "Friday":
			System.out.println("you're in free days");
			break;
		case "Thursday":
			System.out.println("you're in free days");
			break;
		case "Saturday":
			System.out.println("you're in Work days");
			break;
		case "Monday":
			System.out.println("you're in Work days");
			break;
		case "Sunday":
			System.out.println("you're in Work days");
			break;
		case "Tuesday":
			System.out.println("you're in Work days");
			break;
		case "Wednesday":
			System.out.println("you're in Work days");
			break;
		default:
			System.out.println("Sorry This Isn't A Day");
			break;
		}

	}

}
