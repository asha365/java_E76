//java Program to display Fibonacci Series using while loop
import java.util.Scanner;

public class FibonacciWhile{
	public static void main(String args[]){
		int number = 10;
		int n1 = 0;
		int n2 = 1;
		int i = 1;
		
		while (i <= number){
			System.out.print(n1+ " + ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			i++;
		}
		
	}
}