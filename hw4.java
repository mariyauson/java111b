//get input
//check month
//figure out if leap year
//if leapyear and feb, +1 day

import java.util.Scanner;

public class hw4 {
  public static void main(String[] args) {
    Scanner input = new java.util.Scanner(System.in);
    //System.out.println("Tacos");
    // Prompt the user to enter inputs
    System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
    String month = input.nextLine();
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    int days = 31;

    switch (month) {
        case "1": month = "January";
                  break;
        case "2": month = "February";
                  days = 28;
                  break;
        case "3": month = "March";
                  break;
        case "4": month = "April";
                  days = 30;
                  break;
        case "5": month = "May";
                  break;
        case "6": month = "June"; 
                  days = 30;
                  break;
        case "7": month = "July";
                  break;
        case "8": month = "August";
                  break;
        case "9": month = "September"; 
                  days = 30;
                  break;
        case "10": month = "October";
                   break;
        case "11": month = "November";
                   days = 30;
                   break;
        case "12": month = "December";
                   break;
        default: month = "Invalid month";
                 break;
    }
    
    
    //did not use loop function since we only go over once. 
    // short circuiting - skipping once a value has been determined
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    if (isLeapYear == true && month == "February") {
        days += 1;
    }
    
    System.out.println(month + " " + year + " has " + days + " days");
    
    
    }
}
