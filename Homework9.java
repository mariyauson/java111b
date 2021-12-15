/* Sections 11.2–11.4
11.1 (The Triangle class) Design a class named Triangle that extends 
GeometricObject. The class contains:
■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
■ A no-arg constructor that creates a default triangle.
■ A constructor that creates a triangle with the specified side1, side2, and side3.
■ The accessor methods for all three data fields.
■ A method named getArea() that returns the area of this triangle.
■ A method named getPerimeter() that returns the perimeter of this triangle.
■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 " side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and 
implement the classes. Write a test program that prompts the user to enter three 
sides of the triangle, a color, and a Boolean value to indicate whether the triangle 
is filled. The program should create a Triangle object with these sides and set 
the color and filled properties using the input. The program should display 
the area, perimeter, color, and true or false to indicate whether it is filled or not


*/

public class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject (String c, boolean f) {
        color = c;
        filled = f;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setFilled(boolean f) {
        filled = f;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "\ncolor: " + color + "\nfilled: " + filled;
    }
}

/* public class GeometricObject {
  
  private String color;
  private boolean filled;
  
  public GeometricObject (String c, boolean f) {
    color = c;
    filled = f;
  }
  public void setColor(String c) {
    color = c;
  }
  public void setFilled(boolean f) {
    filled = f;
  }
  public boolean isFilled() {
    return filled;
  }
  public String toString() {
    return "\ncolor: " + color + "\nfilled: " + filled;
  } */

  /* starter code
public class Triangle {
  
   // put your solution here   
 
   public static void main(String[] args) { 
    
    GeometricObject a = new GeometricObject("black", true);
    GeometricObject b = new GeometricObject("white", false);
    System.out.println(a);
    System.out.println(b);
    a.setColor("green");
    a.setFilled(false);
    System.out.println(a);
    Triangle c = new Triangle();
    System.out.println(c);
    c.setSide1(3.0);
    c.setSide2(4.0);
    c.setSide3(5.0);
    c.setFilled(true);
    System.out.println("Side 1: " + c.getSide1());
    System.out.println("Side 2: " + c.getSide2());
    System.out.println("Side 3: " + c.getSide3());
    System.out.println("Perimeter is: " + c.getPerimeter());
    System.out.println("Area is: " + c.getArea());
    GeometricObject d = new Triangle(5.0, 8.0, 10.0); 
    d.setColor("purple");
    System.out.println(d);
  }
}
*/


