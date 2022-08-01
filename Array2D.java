package application1;

import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> General = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Milk");
		drinks.add("Tea");
		drinks.add("Coffee");
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Beans");
		food.add("Maize");
		ArrayList<String> vegtable = new ArrayList<String>();
		vegtable.add("Tomatoes");
		vegtable.add("Peppers");
		vegtable.add("Patatoes");
		
		General.add(drinks);
		General.add(vegtable);
		General.add(food);
		for (int i = 0; i < General.size(); i++) {
			System.out.println(General.get(i));
			
		}

	}

}
