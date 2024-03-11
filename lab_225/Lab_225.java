package lab_225;
import javax.swing.JOptionPane;
public class Lab_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;
		String strNotification = "You've just entered:";
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2 += strNum2;
		JOptionPane.showMessageDialog(null, strNotification,"2 numbers you just enter is: ", JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		String result = "";
		
		double sum = num1 + num2;
		result += "Sum: " + sum + "\n";
		
		double difference = Math.abs(num1 - num2);
		result += "Difference " + difference + "\n";
		
		double product = num1 * num2;
		result += "Product: " + product + "\n";
		
		if (num2 == 0) {
			result += "Quotient: Undefined";
		}
		else {
			double quotient = num1 / num2;
			result += "Quotient: " + quotient + "\n";
		}
		JOptionPane.showMessageDialog(null, result,"Output", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
	}

}
