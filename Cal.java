package cal;

import java.util.Scanner;

public class Cal {
	
	public static void main(String[] args) {
		  int number1,number2,result;
		  
		  System.out.println("This is Calculator");
		  System.out.println("1.Addition");
		  System.out.println("2.Substarction");
		  System.out.println("3.Multiplication");
		  System.out.println("4.Division");
		  

	    Scanner sc=new Scanner(System.in);
	    int ch=sc.nextInt();
	    
	    System.out.println("Enter first number");
	    number1 = sc.nextInt();

	    System.out.println("Enter second number");
	    number2 = sc.nextInt();
	   
	   

	    switch (ch) {

	      // performs addition between numbers
	      case 1:
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case 2:
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case 3:
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case 4:
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid input!");
	        break;
	    }

	    
	  }

}
