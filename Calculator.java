//Java Program to make a Simple Calculator using Switch Case
 //simple mathmetical operation using switch case
 
import java.util.Scanner;
 
 public class Calculator{
	 public static void main(String args[]){
		 
		 int num1, num2, result;
		 String symbol;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 
		 num1 = input.nextInt();
		 System.out.println("Enter the second number:");
		 num2 = input.nextInt();
		 
		 System.out.println("Select any sembol(+, -, *, /)");
		 symbol = input.next();
		 
		 switch(symbol)
		 {
			 case "+":
			 result = num1+num2;
			 System.out.println("The Addition of two number is:"+result);
			 break;
			 
			 case "-":
			 result = num1-num2;
			 System.out.println("The substruction of two number is:"+result);
			 break;
			 
			 case "*":
			 result = num1*num2;
			 System.out.println("The Multiplication of two number is:"+result);
			 break;
			 
			 case "/":
			 result = num1/num2;
			 System.out.println("The Division of two number is:"+result);
			 break;
			 
			 default:
			 System.out.println("The number is invalid");
		 }	  
		 
	 }
 }