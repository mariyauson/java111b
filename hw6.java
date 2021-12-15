import java.util.*;

public class hw6 {

    public static void makeParallelogram(int length, char ch){
    // put your solution here

        int middle_row = length;
        int a = 1;
        int space_placeholder = 2; 
        String whitespace = " ";
        
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < (i+1); j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j <= length && j >= space_placeholder  ) {
                    System.out.print(ch);
                }
                else {
                    System.out.print(whitespace);
                }
            }
            System.out.println();
            space_placeholder++;
        }
    }

        /*while (i < middle_row) {
            String output = new String(new char[i]).replace("\0", ch);
            System.out.println(output);
            //System.out.println(ch.repeat(i));
            i++;
            
        }
        
        while (middle_row > 0) {
            
            String output = new String(new char[middle_row]).replace("\0", ch);
            String output_spaces = new String(new char[i-length]).replace("\0", whitespace);
            System.out.print(output_spaces);
            System.out.println(output);
            //System.out.println(whitespace.repeat(i-length) + ch.repeat(middle_row));
            middle_row--;
            i++;
            }
        }*/

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("This program will output a parallelogram.");
    System.out.println("How long do you want each side to be?");
    int get_size = input.nextInt();
    input.nextLine();
    System.out.println("Please enter the character you want it to be made of:");
    String get_char = input.nextLine();
    char character = get_char.charAt(0);
    //System.out.print(character);
    System.out.println("Parallelogram:");
    // put the rest of your solution here
    makeParallelogram(get_size, character);

    
    
    }
}
