/*public class Account {
  
  // put your solution here

  public static void main (String[] args) {
    
    Account a = new Account(1122, 20000.00);
    Account b = new Account(1010, 30000.00);
    Account c = new Account();
    a.withdraw(2500.00);
    a.deposit(3000.00);
    b.withdraw(30001.00);
    c.deposit(400.00);
    System.out.println("Account ID#: " + a.getId());
    System.out.println("Balance is " + a.getBalance());
    System.out.println("Monthly interest is " + a.getMonthlyInterest());
    System.out.println("Account ID#: " + b.getId());
    System.out.println("Balance is " + b.getBalance());
    System.out.println("Monthly interest is " + b.getMonthlyInterest());
    System.out.println("Account ID#: " + c.getId());
    System.out.println("Balance is " + c.getBalance());
    System.out.println("Monthly interest is " + c.getMonthlyInterest());
    System.out.println("Annual rate is " + b.getAnnualInterestRate());
  }
}

(The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).

M09_LIAN9966_12_SE_C09.indd 363 16/09/19 4:58 PM

364 Chapter 9 Objects and Classes

■ A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume that all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
account.
■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate.

Monthly interest is balance * monthlyInterestRate. monthlyIntere-
stRate is annualInterestRate / 12. Note annualInterestRate is a per-
centage, for example 4.5%. You need to divide it by 100.)

Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.


every object needs certain things. 
public class ClassName { 
data fields, 
constructors, 
getters aka accessors (the obj, once instantiated, tells something abt itself. visibility data type methodname()),
setters (maybe) aka mutators, 
custom methods 


mutators is a method that enables you to change the variables inside the class.

*/


public class Account {
  
    // put your solution here
    // instance variables/data fields
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    //System.out.println(id);
    
    //default constructor. no args
    public Account() {
        this.id = id;
        this.balance = balance;
        //this.annualInterestRate = 0.0;
        
    }
    
    //constructors is what makes/builds an object. never have return type. not even void. it's just visibility and name of class
    public Account(int id, double balance) {
        this.id = id; //this -> refers to the obj being created. left id points to line "private int id = 0" (the instance variables aka data fields)
        this.balance = balance;
        //this.annualInterestRate;
        
    }
    
    
    
    //create id.setter
    //this keyword refers to the obj calling the method.
    //this refers to the obj that called it. example account a is an obj
    public void setId(int id) {
        this.id = id;
    }
    
    //grab id. getter
    public int getId() {
        return this.id;
    }
    
  
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }
    
    public double getMonthlyInterest() {
        double monthlyInterest = balance * getMonthlyInterestRate();
        if (monthlyInterest >= 0) {
          return monthlyInterest;
        }
        else {
            return 0;
        }
    }
    
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    
    
    
    
    
  
    public static void main (String[] args) {
      
      Account a = new Account(1122, 20000.00); //how to instantiate an obj of this type
      Account b = new Account(1010, 30000.00);
      Account c = new Account();
      a.setAnnualInterestRate(4.5);
      b.setAnnualInterestRate(4.5);
      c.setAnnualInterestRate(4.5);
      a.withdraw(2500.00);
      a.deposit(3000.00);
      b.withdraw(30001.00);
      c.deposit(400.00);
      System.out.println("Account ID#: " + a.getId());
      System.out.println("Balance is " + a.getBalance());
      System.out.println("Monthly interest is " + a.getMonthlyInterest());
      System.out.println("Account ID#: " + b.getId());
      System.out.println("Balance is " + b.getBalance());
      System.out.println("Monthly interest is " + b.getMonthlyInterest());
      System.out.println("Account ID#: " + c.getId());
      System.out.println("Balance is " + c.getBalance());
      System.out.println("Monthly interest is " + c.getMonthlyInterest());
      System.out.println("Annual rate is " + b.getAnnualInterestRate());
    }
  }
  