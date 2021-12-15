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


  
  
  







/*import java.io.*;
import java.util.*;

public class Menu {

  public static void main(String[] args) throws IOException {
    
      
      System.out.println("Most Expensive Meal");
      System.out.println("-------------------");
      System.out.println("Appetizer  : ");
      System.out.println("Entree     : ");
      System.out.println("Dessert    : ");
      System.out.println("Total Price:  ");
      System.out.println("Sorry, input file: was not found."); */









      import java.io.*;
import java.util.*;

public class Menu {

  public static void main(String[] args) throws IOException {
      
    /*System.out.println("Most Expensive Meal");
      System.out.println("-------------------");
      System.out.println("Appetizer  : ");
      System.out.println("Entree     : ");
      System.out.println("Dessert    : ");
      System.out.printf("Total Price:  ");
      System.out.println("Sorry, input file: was not found.");*/
      
      //in the event theres an error, IO exception is the type of error it will "throws". throw is diff from throws. throws you put it in header of main method. try-catch block will try to catch that error.
            
      
      /*String file_name = "louie.txt";
        try {
            File f = new File(file_name);
            Scanner s = new Scanner(f);
            while (s.hasNext()){
                System.out.println(s.nextLine());
            }
        }
        
        catch (Exception e){
            System.out.println("Error locating "+file_name);
        }

        System.out.println("Do i get to finish if I go to catch block?");
    } */
      

        
        String file_name = "louie.txt";
        try {
            File f = new File(file_name);
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }
        }
        
        catch (Exception e) {
            System.out.println("Please enter the filename you wish to process: Sorry, input file: '" + file_name + "' was not found");
        }
    
      
      
      
    
      //PrintWriter pw =new ...
      File file = new File("menu.txt");
      Scanner menu_reader = new Scanner(file);
      /*while(menu_reader.hasNextLine()) {
          System.out.println(menu_reader.nextLine());
      }*/
      
      //String menu_line = "";
      //double menu_price = 0.0;
      int category = 0;
      double max_appetizer_price = 0.0;
      double max_entree_price = 0.0;
      double max_dessert_price = 0.0;
      String max_appetizer_name = "";
      String max_entree_name = "";
      String max_dessert_name = "";
      //int data_category = 0;
      double total_price = 0.0;
      //System.out.print(menu_reader);
      while (menu_reader.hasNextLine()) {
        
        String data = menu_reader.nextLine();
        String[] data_split = data.split(", ");
        
        /*for (String s: data_split) {
            System.out.print(s);
            System.out.print("*********");
        }
        System.out.println();*/
        //System.out.println(data_split[0] + "\t" + data_split[1] + "\t" + data_split[2]);
        //System.out.println(data_split);
        double current_price = Double.parseDouble(data_split[1].substring(1));
        int data_category = Integer.parseInt(data_split[2]);
        //System.out.println("dc = " + data_category);
        
        
       /* if (current_price > max_price[data_category]) {
            max_price[data_category] = current_price;
            max_item_name[data_category] = item_name;
            //instantiate array in the beginning. example String[] max_prices = {0, 0, 0}''
        } */
        
        switch (data_category) {
            
            
            /*case 3:
                if (current_price > max_dessert_price) {
                    max_dessert_price = current_price;
                    max_dessert_name = data_split[0];
                    break;
                }
                
            case 2:
                if (current_price > max_entree_price) {
                    max_entree_price = current_price;
                    max_entree_name = data_split[0];
                    break;
                }
                
            case 1:
                if (current_price > max_appetizer_price) {
                    max_appetizer_price = current_price;
                    max_appetizer_name = data_split[0];
                    break;
                }*/
            
                
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
            
        }
      }
      
      
     
      total_price = max_dessert_price + max_appetizer_price + max_entree_price;
      
      System.out.println("Please enter the filename you wish to process: Most Expensive Meal");
      System.out.println("-------------------");
      System.out.println("Appetizer  : " + max_appetizer_name);
      System.out.println("Entree     : " + max_entree_name);
      System.out.println("Dessert    : " + max_dessert_name);
      //System.out.println("Total price: " + rounded_total_price);
      System.out.printf("Total Price: $%.2f", total_price);
      //System.out.println("Sorry, input file: was not found.");
       
  }
}

//implements, interface, method signatures, comparator. any item/number that has a comparator to a class can be sent to something like sorting algorithm. ex, a user defined obj that is a student name. sort this student name obj by last name, student id, or first name. java wont know how to sort so you can write a comparator class to make your obj "extends" or "implements" comparator. example, class car implements gas nozzle. you dont know what car will come but by implementing gas nozzle, that gas nozzle will fit. 


====
*/
