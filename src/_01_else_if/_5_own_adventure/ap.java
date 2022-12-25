package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ap {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Idk what to do so say yes or no");
		if (input.equals("yes")) {
			String input1 = JOptionPane.showInputDialog("Ok good were getting somewhere.So do you have a story");
			if (input1.equals("yes")) {
				String inputYes = JOptionPane.showInputDialog("Ok you can type out the story and ill print it out.");
				System.out.println(inputYes);
			}
			if (input1.equals("no")) {
				String inputNo = JOptionPane.showInputDialog("Well can you think of one then?");

				if (inputNo.equals("no")) {
					JOptionPane.showMessageDialog(null, "Then get out of here.");
				}
				if (inputNo.equals("yes")) {
					String input3 = JOptionPane.showInputDialog("Ok you can type out the story and ill print it out.");
					System.out.println(input3);
				}

			}
		}
		if (input.equals("no")) {
			String input2 = JOptionPane.showInputDialog("Ok good were getting somewhere.So do you have a story");

			if (input2.equals("no")) {
				String inputNo1 = JOptionPane.showInputDialog("Well can you think of one then?");

				if (inputNo1.equals("no")) {
					JOptionPane.showMessageDialog(null, "Then get out of here.");
				}
				if (inputNo1.equals("yes")) {
					String input3 = JOptionPane.showInputDialog("Ok you can type out the story and ill print it out.");
					System.out.println(input3);
				}
			}
			if (input2.equals("yes")) {
				String inputYes2 = JOptionPane.showInputDialog("Ok you can type out the story and ill print it out.");
				System.out.println(inputYes2);
			}

		}
	}
}
