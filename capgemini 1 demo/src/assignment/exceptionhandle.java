package assignment;
import java.util.Scanner;
public class exceptionhandle{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=0;
		double result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to be divided: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		try {
			result=(double)n1/n2;
			System.out.println("Division of two numbers is: "+ result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Can't be divided by zero ");
		}
	}
}
