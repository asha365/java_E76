//9.Java Program to find factorial using while loop.
//3! = 1*2*3
//4! = 1*2*3*4
//5! = 1*2*3*4*5

public class FactorialWhile{
	public static void main(String args[]){
		    int fact = 1;
			int n = 4, temp;
			temp = n;
		
		while(n >= 1){
			fact = fact * n;
			n--;
		}
		
		System.out.println(temp+"!=" +fact);
	 }
}
	