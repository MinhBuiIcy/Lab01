package lab_226;
import javax.swing.JOptionPane;
public class Lab_226 {
	public static void first(){
		Integer a = 0,b = 0;
		
		String strA = JOptionPane.showInputDialog(null, "a = ", "Please input a: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a = Integer.parseInt(strA);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strB = JOptionPane.showInputDialog(null, "b = ", "Please input b: ", JOptionPane.INFORMATION_MESSAGE);
		if(strB == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			b = Integer.parseInt(strB);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		if (a==0) {
			JOptionPane.showMessageDialog(null, "No solution","Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "The value of x is: " + -b/a,"Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void system_first() {
		Integer a11=0,a12=0,b1=0,a21=0,a22=0,b2=0;
		
		String strA11 = JOptionPane.showInputDialog(null, "a11 = ", "Please input a11: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA11 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a11 = Integer.parseInt(strA11);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strA12 = JOptionPane.showInputDialog(null, "a12 = ", "Please input a12: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA12 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a12 = Integer.parseInt(strA12);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strB1 = JOptionPane.showInputDialog(null, "b1 = ", "Please input b1: ", JOptionPane.INFORMATION_MESSAGE);
		if(strB1 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			b1 = Integer.parseInt(strB1);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strA21 = JOptionPane.showInputDialog(null, "a21 = ", "Please input a21: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA21 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a21 = Integer.parseInt(strA21);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strA22 = JOptionPane.showInputDialog(null, "a22 = ", "Please input a22: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA22 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a22 = Integer.parseInt(strA22);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strB2 = JOptionPane.showInputDialog(null, "b2 = ", "Please input b2: ", JOptionPane.INFORMATION_MESSAGE);
		if(strB2 == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			b2 = Integer.parseInt(strB2);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		Integer D = a11 * a22 - a21 * a12;
		Integer D1 = b1 * a22 - b2 * a12;
		Integer D2 = a11 * b2 - a21 * b1;
		if (D == 0) {
			JOptionPane.showMessageDialog(null, "Infinite solutions","Message", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "The value of x1 is: " + D1 / D + "\n The value of x2 is: " + D2/D,"Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void second() {
		Integer a=0, b=0, c=0;
		
		String strA = JOptionPane.showInputDialog(null, "a = ", "Please input a: ", JOptionPane.INFORMATION_MESSAGE);
		if(strA == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			a = Integer.parseInt(strA);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strB = JOptionPane.showInputDialog(null, "b = ", "Please input b: ", JOptionPane.INFORMATION_MESSAGE);
		if(strB == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			b = Integer.parseInt(strB);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		String strC = JOptionPane.showInputDialog(null, "c = ", "Please input c: ", JOptionPane.INFORMATION_MESSAGE);
		if(strC == null) {
			JOptionPane.showMessageDialog(null, "OK","Message ", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			c = Integer.parseInt(strC);
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Invalid integer","Message", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		
		if (a==0) {
			if (b==0) {
				if (c == 0) {
					JOptionPane.showMessageDialog(null, "Infinite solutions","Message", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "No solutions","Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "The value of x is: " + -c/b,"Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else {
			Double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				JOptionPane.showMessageDialog(null, "No solutions","Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				Double candelta = Math.sqrt(delta);
				JOptionPane.showMessageDialog(null, "The first solution is: " + (-b + candelta)/ (2 * a) + "\n The second solution is: " + (-b - candelta)/ (2 * a),"Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer choice  = 0;
		do {
			String strChoice;
			strChoice = JOptionPane.showInputDialog(null, "Select your choice\n1. First-degree equation\n2. System of first-degree equation\n3. Second-degree equation", "Input the choice number", JOptionPane.INFORMATION_MESSAGE);
			if (strChoice == null) {
				JOptionPane.showMessageDialog(null, "Thank you and good bye!!!","Message ", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			try {
				choice = Integer.parseInt(strChoice);
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid integer","Message ", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			switch(choice) {
			case 1:
				first();
				break;
			case 2:
				system_first();
				break;
			case 3:
				second();
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid command","Message ", JOptionPane.INFORMATION_MESSAGE);
				choice = -1;
			}
		}while (choice != 0);
	}

}
