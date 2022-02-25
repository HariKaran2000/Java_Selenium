package assignment;
import java.util.Scanner;

public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 x=sc.nextInt();
		System.out.println("Enter the number: ");
		 y=sc.nextInt();
		maths obj = new maths();
		obj.Addition(x,y);
		obj.Substraction(x,y);
		obj.Multiplication(x,y);
		obj.Division(x,y);
	
		

	}
	public void Addition(int x,int y) {
		System.out.println("Addition of that number is: "+(x+y));
		
	}
	public void Substraction(int x,int y) {
		System.out.println("Substraction of that number is: "+(x-y));
		
	}
	public void Multiplication(int x,int y) {
		System.out.println("Multiplication of that number is: "+(x*y));
		
	}
	public void Division(int x,int y) {
		System.out.println("Division of that number is: "+(x/y));
		
		
	}
	

}
