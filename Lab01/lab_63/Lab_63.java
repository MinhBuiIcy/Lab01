package lab_63;
import java.util.Scanner;
public class Lab_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The height: ");
		int n = keyboard.nextInt();
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j< 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
