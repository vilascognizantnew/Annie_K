
import java.util.Scanner;

public class ValidateDate {

   

    public static void main (String [] args) {
        int month, day, year;
        boolean leapYear, validDate = false;


        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the month, day, and year in interger form.");

        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Day: ");
        day = sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();

        leapYear = isLeapYear(year);
        validDate = isValidDate(month, day, year);

        System.out.printf("%nThe date is %svalid and is %sa leap year.%n", validDate ? "" : "not ", leapYear ? "" : "not ");
        sc.close();
    }

    public static int numDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
             return 31;
        case 4:
        case 6:
        case 9:
        case 11:
             return 30;
        case 2:
             if (isLeapYear) {
                 return 29;
             } else {
                 return 28;
             }
        default:
             return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0));
    }

    public static boolean isValidDate(int month, int day, int year) {
        int maxYear=40000;
		return (month >= 1 && month <= 12) && (day >= 1 && day <= numDaysInMonth(month, isLeapYear(year))) && (year >= 0 && year <= maxYear);
    }
}