//import java.util.*;

/*

(The Triangle class) Design a class named Triangle that extends 
GeometricObject. The class contains:
■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of a triangle.
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
the area, perimeter, color, and true or false to indicate whether it is filled or not.
*/

public class Triangle extends GeometricObject {
  
    private double side1;
    private double side2;
    private double side3;
   // put your solution here   
 
   public static void main(String[] args) { 
    
    GeometricObject a = new GeometricObject("black", true);
    GeometricObject b = new GeometricObject("white", false);
    System.out.println(a);
    System.out.println(b);
    a.setColor("green");
    a.setFilled(false);
    System.out.println(a);
    Triangle c = new Triangle(); //needs to have argument with matching number of parameters
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
  
    /*public Triangle() {
        super("white", false);
    }*/
    
    public Triangle() { //when you have a constructor, you're updating the variable
        //the geometricobj requires you to have arguments string and boolean, so you have to give it the arguments)
        //return new GeometricObject("white", "false");
        super("white", false); //default case. values for geometricobj
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        //System.out.println(side1);
        //System.out.println(side2);
        //System.out.println(side3);
        //or side1 = side2 = side3 = 1.0;
    }
      
    public Triangle(double side1, double side2, double side3) {
      super("white", false);
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    }
    
    /*public Triangle(String c, boolean f) { //lets user create new triangle with these 2 info
        super(c, f); 
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }*/
    
    //constructors really are setters.
    
    
    public double getArea() {
      double sum_sides = (side1 + side2 + side3) / 2.0;
      double radicand = sum_sides * ((sum_sides - side1) * (sum_sides - side2) * (sum_sides - side3));
      double area = Math.sqrt(radicand);
      return area;
    }
    
    public double getPerimeter() {
      return side1 + side2 + side3; 
    }
    
    public String toString() { //toString method is useful for println. We really have a discretion of have we right our object.
        //super("purple", false);
        //String x = this.GeometricObject::toString();
        //this.GeometricObject::toString()

        //GeometricObject geo = this;
        //System.out.println("geo = " + geo);
        //String x = null;
        //x += geo.toString();

        //return ((GeometricObject)this).toString(); //casting this as a geometric object, and taking its toString() method
        String x = "\nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
        //String x = "color: " + this.color + "\nfilled: " + this.filled; 
        //x += "\nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3; //println takes care of the last one
      //should also give the color and fill
        return super.toString() + x ;
    }
      
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    public void setSide2(double side2) {
        this.side2 = side2; 
    }
    
    public void setSide3(double side3) {
        this.side3 = side3; 
    }
    
    public double getSide1() {
        return side1; //or this.side1
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }
    
    /*public String color() {
        return color;
    }
    
    public String filled() {
        return filled;
    }*/
  } 
  

