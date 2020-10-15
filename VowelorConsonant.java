//4.Java Program to check whether a char is vowel or Consonant using Switch Case.

import java.util.Scanner;

public class VowelorConsonant{
	
	public static void main(String args[]){
		System.out.print("Enter a latter:");
		
		String chr;
		Scanner vc = new Scanner(System.in);
		chr = vc.next();
		
		switch(chr)
		{
			case "a":
			System.out.println("Vowel");
			break;
		
			case "e":
			System.out.println("Vowel");
			break;
			
			case "i":
			System.out.println("Vowel");
			break;
			
			case "o":
			System.out.println("Vowel");
			break;
			
			case "u":
			System.out.println("Vowel");
			break;
			
			default:
			System.out.println("Consonant");
		
		}
	}
}