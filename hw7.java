/*import java.util.*;

public class Homework7 {

// This method prints the contents of an array
public static void printArray(int[] array) {
  // put your solution here
}


// This method takes in an array and returns an array with the duplicates removed
public static int[] deDup(int[] array) {
  // put your solution here
}

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number of integers you would like to enter:");  
  System.out.println("Enter a sequence of integers separated by spaces:");
  System.out.print("List -> ");
  System.out.print("DeDup List -> ");
  // add your part of the solution
  }
}*/

import java.util.*;

public class hw7 {

// This method prints the contents of an array
public static void printArray(int[] array) {
  // put your solution here
  String print_string = "";
  
  
  for (int i: array) {
      print_string += i + " ";
  }
  int end_range = print_string.length() - 1;
  print_string.substring(0, end_range);
  System.out.println(print_string);
}


// This method takes in an array and returns an array with the duplicates removed !Arrays.asList(new_array).contains(array[i])
public static int[] deDup(int[] array) {
  // put your solution here
  int[] arr = array;
  int[] unique = new int[arr.length];
  int counter = 0;
  
  for (int i = 0; i < arr.length; i++) {
      boolean is_duplicate = false;
      for (int j = (i+1); j < arr.length; j++) {
          if (arr[i] == arr[j]) {
              is_duplicate = true;
              break;
          }
      }
      if (!is_duplicate) {
          unique[i] = arr[i];
          counter++;
      }
  }


  int[] final_array = new int[counter];
  int start = 0;
  
  for (int a = 0; a < unique.length; a++) {
      if (unique[a] != 0) {
          final_array[start] = unique[a];
          start++;
      }
  }

  
  Arrays.sort(final_array);
  return final_array;
  
  /*Arrays.sort(unique); 
  int[] final_array = new int[counter];
  int l = 0;
  
  for (int k = (unique.length - counter); k < unique.length; k++) {
          final_array[l] = unique[k];
          l++;
  }
  
  
  
  return final_array; */
  
  
}
  

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number of integers you would like to enter:");  
  int num_of_integers = input.nextInt();
  input.nextLine();
  System.out.println("Enter a sequence of integers separated by spaces:");
  String user_int_list = input.nextLine();
  
  String[] string_list_array = user_int_list.split(" ");
  int[] int_list_array = new int [string_list_array.length];
  for (int i = 0; i < string_list_array.length; i++) {
      int_list_array[i] = Integer.parseInt(string_list_array[i]);
  }
  
  System.out.print("List -> ");
  printArray(int_list_array);
  System.out.print("DeDup List -> ");
  // add your part of the solution
  printArray(deDup(int_list_array));
  
  
  }
}