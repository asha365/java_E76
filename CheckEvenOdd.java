//3.Java Program to check if number is even or odd.

import java.util.Scanner;

 public class CheckEvenOdd{
	 public static void main(String args[]){
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Ente any input number:");
		 
		 int num;
		 num = input.nextInt();
		 
		 if(num%2 ==0){
			 System.out.println("This is even number");
		 }
		 else{
			 System.out.println("This is odd number");
		 }
		 
	 }
 }