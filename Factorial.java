//Java Program to find factorial of a number using loops.
//3! = 1*2*3
//4! = 1*2*3*4
//5! = 1*2*3*4*5
import java.util.Scanner;

public class Factorial{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int num, fact = 1;
		
		System.out.print("Enter any number:");
		num = input.nextInt();
		
		for(int i = num; i >= 1; i--){
		fact = fact * i; 
		}
	
		System.out.println("Factorial = " + fact);
		
		
	}
}