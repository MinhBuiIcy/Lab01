package lab_64;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_64 {
	public static int getMonth(String input) {
        switch (input) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }
	
	public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
	
	public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }
	
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the month : ");
            String monthInput = keyboard.nextLine().toLowerCase();
            int month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month input. Please enter again.");
                continue;
            }
            
            
            int year = 0;
            while(true) {
            	System.out.print("Enter the year (non-negative number): ");
            	try {
            		year = keyboard.nextInt();
            		break;
            	}
            	catch(InputMismatchException e) {
            		System.out.println("Error, try again");
            		keyboard.nextLine();
            	}
            }
            if (year < 0) {
                System.out.println("Invalid year input. Please enter a non-negative number.");
                continue;
            }
            
            int days = getDaysInMonth(month, year);
            if (days == -1) {
                System.out.println("Invalid month or year. Please enter again.");
                continue;
            }
            
            System.out.println("Number of days in " + getMonthName(month) + " " + year + " is: " + days);
            break;
        }
        
        keyboard.close();
	}

}
