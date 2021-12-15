import java.io.*;
import java.util.*;

public class Menu {



  public static void main(String[] args) throws IOException {
      
      int category = 0;
      double max_appetizer_price = 0.0;
      double max_entree_price = 0.0;
      double max_dessert_price = 0.0;
      String max_appetizer_name = "";
      String max_entree_name = "";
      String max_dessert_name = "";
      double total_price = 0.0;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the filename you wish to process: ");
      String input_name = input.nextLine();
      //System.out.println(input_file_name);
            
      
      try {
            
            File file = new File(input_name); //name of file we want to get input from
            Scanner menu_reader = new Scanner(file); //using scanner class to read from that file. we can use the commands for scanner class. nextline, nextfloat, nextint, etc
            System.out.println("Most Expensive Meal");
            
            while (menu_reader.hasNextLine()) {
                String data = menu_reader.nextLine();
                String[] data_split = data.split(", ");
                
                double current_price = Double.parseDouble(data_split[1].substring(1));
                int data_category = Integer.parseInt(data_split[2]);
            
                switch (data_category) {
                    case 1:
                        if (current_price > max_appetizer_price) {
                            max_appetizer_price = current_price;
                            max_appetizer_name = data_split[0];
                            //break; not here!
                        }
                        break; //put break outside if block
                    case 2:
                        if (current_price > max_entree_price) {
                            max_entree_price = current_price;
                            max_entree_name = data_split[0];
                        }
                        break;
                    case 3:
                        if (current_price > max_dessert_price) {
                            max_dessert_price = current_price;
                            max_dessert_name = data_split[0];
                        }
                        break;
                    
                } //close switch
              } //close while(menu_reader.hasNextLine())
            
            
              total_price = max_dessert_price + max_appetizer_price + max_entree_price;
              
              menu_reader.close(); //is this here?
              
              
              //System.out.print("Please enter the filename you wish to process: ");
              //System.out.println("Most Expensive Meal");
              System.out.println("-------------------");
              System.out.println("Appetizer  : " + max_appetizer_name);
              System.out.println("Entree     : " + max_entree_name);
              System.out.println("Dessert    : " + max_dessert_name);
              //System.out.println("Total price: " + total_price);
              System.out.printf("Total Price: $%.2f\n", total_price);
              //System.out.println("Sorry, input file: was not found.");    
            //} //close else
      }//close try
            
      catch (IOException ioe){ //if there is no exception, this block will be ignored
          System.out.println("Sorry, input file: '" + input_name + "' was not found.");
    }
  } //close main

/*finally {
  System.out.print("hello world");
}*/
      
} //close Menu


  
  
  