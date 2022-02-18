package application1;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scanner.nextLine();
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		System.out.println("Your name is "+name+", and your age is "+age);
	}

}
