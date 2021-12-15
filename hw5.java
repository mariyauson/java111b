import java.util.*;

public class hw5 {

  public static void main(String[] args) {
    
        /*System.out.printf("total: %d\n", total);
        System.out.printf("subtotal: %d\n", subtotal);*/
        Scanner input = new java.util.Scanner(System.in);
        int previousInput = 0;
        int subtotal = 0;
        int total = 0;
        int counter = 0;
        
        
        while (keepGoing) {
            int currentInput = input.nextInt();
            if (currentInput == 0 && previousInput != 0) {
                System.out.println("subtotal: " + subtotal);
                subtotal = 0;
            }
            else {
                subtotal += currentInput;
                total += currentInput;
            }
            
            if (previousInput == 0 && currentInput == 0) {
                keepGoing = false;
                if (total != 0) {
                    System.out.printf("total: %d", total);
                }
                else {
                    System.out.println("subtotal: " + subtotal);
                    System.out.printf("total: %d", total);
                }
            }
            previousInput = currentInput;
        }
        
        
        
    }
}