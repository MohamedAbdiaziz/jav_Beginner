package application1;

import java.util.ArrayList;

public class For_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] names = {"Moha","hassan","Ali","Yuusuf"};
		ArrayList<String> names = new ArrayList<String>();
		names.add("Moha");
		names.add("Hassan");
		names.add("Ali");
		names.add("Yuusuf");
		
		for (String i : names) {
			System.out.println(i);
		}
	}

}
