package _01_else_if._4_are_you_happy;
import javax.swing.JOptionPane;
public class AreYouHappy {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Are you happy?");
	if(input==("no")) {
		String input1 = JOptionPane.showInputDialog("Do you want to be happy?");
	}
	if(input1==("no")) {
		JOptionPane.showMessageDialog(null,"Keep doing whatever your doing.");
	}
	if(input1==("yes")) {
		
	}
}
}
