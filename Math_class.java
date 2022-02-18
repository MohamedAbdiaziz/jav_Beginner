//finding Hypotenuse
package application1;
import java.util.Scanner;
public class Math_class {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		System.out.println("to find Hypotenuse Please Enter a and b.");
		System.out.print("Please enter a: ");
		a= scanner.nextDouble();	
		System.out.print("Please enter b: ");
		b= scanner.nextDouble();
		c= Math.sqrt((a*a)+(b*b));
		System.out.println("The Hypotenuse is "+c);
		
		scanner.close();

		
	}

}
