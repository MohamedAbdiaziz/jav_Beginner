package application1;
import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = "";
		do{
			System.out.print("Enter your Name: ");
			name = scan.nextLine();
		}while (name.isBlank());
		System.out.println("Hello "+name);
		

	}

}
