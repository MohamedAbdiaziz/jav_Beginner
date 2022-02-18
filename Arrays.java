package application1;
import java.util.Scanner;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = {1,2,3,4,5,6,9,90};
		System.out.println("index\tValue");
		int counter=0;
		for(int element1:arrays) {
			System.out.println(counter +"\t"+ element1);
			counter++;
			System.out.print("");
		}
	}

}
