package lab_65;

import java.util.Scanner;

public class Lab_65 {
	public static int sum(int[] array) {
		int temp = 0;
		for(int i= 0; i<array.length;i++) {
			temp += array[i];
		}
		return temp;
	}
	
	public static double average(int[] array) {
		double ave = sum(array) / array.length;
		return ave;
	}
	public static void sort(int[] array) {
	    for(int i = 0; i < array.length; i++) {
	        for(int j = 0; j < array.length - 1; j++) {
	            if (array[j] > array[j+1]) {
	                swap(array, j, j+1);
	            }
	        }
	    }
	}

	private static void swap(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = keyboard.nextInt();
		
		int[] array = new int[size];
		for(int i= 0; i<size;i++) {
			array[i] = keyboard.nextInt();
		}
		sort(array);
		String noti = "The sorted array is: ";
		for(int i= 0; i<size;i++) {
			noti +=  array[i] + " ";
		}
		noti += "\n";
		System.out.print(noti);
		System.out.println("The sum is: " + sum(array));
		System.out.println("The average is: " + average(array));
		keyboard.close();
	}

}
