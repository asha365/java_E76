//1.Java Program to find the largest of three numbers using if..else..if
  public class LargestNumber{

	public static void main(String args[]){

		int num1 = 500, num2 = 300, num3 = 100;
		
		if(num1 >= num2 && num1 >= num3){
			System.out.println(num1 + "The largest number");
		}
		else if(num2 >= num1 && num2 >= num3){
			System.out.println(num2 + "The largest number");
		}
		else{
			System.out.println(num3 + "The largest number");
			}
		}
	}