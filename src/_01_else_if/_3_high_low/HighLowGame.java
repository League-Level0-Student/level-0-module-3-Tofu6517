
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100-1+1)+1;
		
		// 2. Print out the random variable above
		for(int i=0; i<10; i++) {
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String input = JOptionPane.showInputDialog("guess a number 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int input1 = Integer.parseInt(input);
			// 5. if the guess is correct
				if(input1==random) {
					JOptionPane.showMessageDialog(null,"You Win!");
					System.exit(0);
				}
			// 6. Win
				
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
				
			// 7. if the guess is high
				if(input1>random) {
					JOptionPane.showMessageDialog(null,"too high");
				}
				// 8. Tell them it's too high
				if(input1<random) {
					JOptionPane.showMessageDialog(null,"too low");
				}
			// 9. if the guess is low
				
				// 10. Tell them it's too low

		// 13. Tell them they lose
				if(input.equals(random)) {
					System.exit(0);
				}

		}
		System.exit(0);
	}
	}




