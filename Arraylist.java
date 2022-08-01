package application1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Anjeelo");
		food.set(0, "FishBurger");
		for (int i = 0; i <food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
