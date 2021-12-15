import java.util.*;

public class hw2 {
   
   public static void main(String[] args) {
     
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes: ");
    String minute = input.nextLine();
    int minutes = Integer.parseInt(minute);
    //System.out.println(minutes);
    double years = minutes/60;
    years /= 24;
    years /= 365;
    int roundedYears = (int)(years); 
    String year = String.valueOf(years);
    //System.out.println(roundedYears);
    //double roundedYears = double floor(years); 
    int index =  year.indexOf('.');
    String day = year.substring(index);
    //System.out.print(month);
    double days = Double.valueOf(day); //Double days = Double.valueOf(day);
    days = days * 365;
    //int value = (int)months;
    int roundedDays = (int)(days); // int roundedDays = (int)Math.round(days);
    //System.out.println(round(months));
    //System.out.println();
    //1000000000 minutes is approximately 1902 years and 214 days.

    System.out.printf("%d minutes is approximately %d years and %d days.\n", minutes, roundedYears, roundedDays);

   }
}


