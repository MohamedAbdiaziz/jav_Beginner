package application1;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Name;
		System.out.print("please enter your name: ");
//		Name = input.next();
		Name = input.nextLine();
		if (Name == "") {
			System.out.println("sorry couldn't found name :(");
		}
		else {
			System.out.println("wellcome "+Name);
		}
		
		

	}

}
