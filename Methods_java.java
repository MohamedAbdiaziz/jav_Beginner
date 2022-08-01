package application1;

import java.util.Scanner;

public class Methods_java {

	static void hello(String name, int age, int roll_NO) {
		System.out.println("Welcome "+name+" your Age is "+age+" And your Roll Number is "+roll_NO);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Enter = new Scanner(System.in);
		System.out.print("Please Enter Your Name: ");
		String name = Enter.nextLine();
		System.out.print("Please Enter Your Age: ");
		int age = Enter.nextInt();
		System.out.print("Please Enter Your Name: ");
		int nums = Enter.nextInt();
		hello(name,age,nums);
	}

}
