package application1;
import java.util.Scanner;

public class Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int columns, rows;
		String sym;
		System.out.print("Please Enter columns :");
		columns = scan.nextInt();
		System.out.print("Please Enter rows :");
		rows = scan.nextInt();
		System.out.print("Please Enter Symbol :");
		sym = scan.next();
		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(sym);
				
			}
			System.out.println();
		}
		

	}

}
