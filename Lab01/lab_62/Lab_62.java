package lab_62;
import java.util.Scanner;
public class Lab_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your name");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you ");
		double dHeight = keyboard.nextDouble();
		
		//similar to other data types
		
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is: " + dHeight + ".");
	}

}
