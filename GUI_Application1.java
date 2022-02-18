package application1;
import javax.swing.JOptionPane;


public class GUI_Application1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="Whats Is Your Name?";
		String name= JOptionPane.showInputDialog(message);
		if (name == null) {
			JOptionPane.showMessageDialog(null, "Sorry we don't have any name :(");
			return;
		}
		else if (name=="") {
			System.out.println("sorry this is empty :(");
		}
		else {
			int age = Integer.parseInt(JOptionPane.showInputDialog("what is your Age?"));
//			JOptionPane.showMessageDialog(null, "Hello "+name);
			if (age <=14) {
				JOptionPane.showMessageDialog(null, "Hello "+name+" you are a child ");
			}
			else {
				JOptionPane.showMessageDialog(null, "Hello "+name+" you are a Mature ");
			}
		}
	}
}
