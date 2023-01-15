
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 20";
		String dadsBirthday = "June 9th";
		String myBirthday = "November 19";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input=JOptionPane.showInputDialog("what birthday do you want");
		// 3. Print out what the user typed
	System.out.println(input);
		// 4. if user asked for "mom"
	if(input.equals("mom")) {
	
System.out.println(momsBirthday);
	}

			//print mom's birthday
		// 5. if user asked for "dad"
	if(input.equals("dad")) {
		
System.out.println(dadsBirthday);
	}		
	
// print dad's birthday
		// 6. if user asked for your name
	if(input.equals("yours")) {

System.out.println(myBirthday);	

	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {	
System.out.println("Sorry, I dont remember that persons birthday!");
	}
}
}
