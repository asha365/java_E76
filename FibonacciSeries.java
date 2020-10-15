//7.Java Program to print Fibonacci Series using for loop

// fibo[2] = fibo[2-1] + fibo[2-2];
//fibo[3] = fibo[3-1] + fobo[3-2];
//fibo[4] = fibo[4-1] + fibo[4-2];
//fibo[5] = fibo[5-1] + fibo[5-2];
//fibo[n] = fibo[n-1] + fibo[n-2];
//fibo[i] = fibo[i-1] + fibo[i-2];

import java.util.Scanner;

/*public class FibonacciSeries{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number:");
		int num = input.nextInt();
		
		int first = 0;
		int second = 1;
		int fibo;
		System.out.print(first+" "+second);
		
		for(int i = 3; i <= num; i++){
			fibo = first + second;
			System.out.print(fibo" "+second);
		}
	
		fibo = first + second;
		System.out.print(" "+fibo);
		first = second;
		second = fibo;
	}
		System.out.println();
}*/


public class FibonacciSeries{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		int c;
		
		for (int i = 0; i < 10; i++){
			System.out.println(a+ " ");
			c = a+b;
			a = b;
			b = c;
		}
		
	}
}





















