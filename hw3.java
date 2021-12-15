import java.util.Scanner;

public class hw3 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a SSN: ");
    String input_SSN = input.nextLine();
    char dash_char = '-';
    int length = input_SSN.length();
    int i = 0;
    
    if (length == 11 && input_SSN.charAt(3) == dash_char && input_SSN.charAt(6) == dash_char ) {
      while (i < length) {
        if (Character.isDigit(input_SSN.charAt(i)) == true || input_SSN.charAt(i) == dash_char) {     
          i++; 
        }
        else {
          break;
        }
      }
    }
  
    if (i == 11) {
      System.out.println(input_SSN + " is a valid social security number.");
    }
    else {
      System.out.println(input_SSN + " is an invalid social security number.");
    }
  }
}

/* import java.util.Scanner;

public class Homework3 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a SSN: ");
    String input_SSN = input.nextLine();
    
    //char x = input_SSN.charAt(3);
    //char y = input_SSN.charAt(6);
    //System.out.print(x);
    char a = '-';

    int truthValue = 0;
    int i;

    if (input_SSN.length() == 11) {
      //String shortened_SSN = input_SSN.replace('-', ' ');
        for (i = 0; i < input_SSN.length(); i++) {
            if (Character.isDigit(input_SSN.charAt(i)) == false) {
              if (input_SSN.charAt(i) != '-') {
                truthValue -= 1;
              } 
            }
        }
    }
    
    if (truthValue <= -1 || input_SSN.length() != 11 || input_SSN.charAt(3) != a || input_SSN.charAt(6) != a) {
      System.out.println(input_SSN + " is an invalid social security number.");
      }
    else if (truthValue > -1) {
      System.out.println(input_SSN + " is a valid social security number.");
    }
   
  }
}
*/

