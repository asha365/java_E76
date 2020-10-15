//2.Java Program to check if number is positive or negative

  import java.util.Scanner;
 public class PositiveNegativeNum{
	 
	 public static void main(String args[]){
		 System.out.print("Enter a number:");
		 
		Scanner pn=new Scanner(System.in); 
		int num=pn.nextInt();
		
		if(num > 0){
			System.out.println("Positive number");
		}
		
		else if(num < 0){
			System.out.println("Negative number");
		}
		
		else{
			System.out.println("orgin number");
		}
		
		
	 }
 }