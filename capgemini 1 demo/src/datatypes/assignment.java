package datatypes;
import java.util.Scanner;

public class assignment {
 
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			if(n % 7 == 0){
				System.out.println("The given number is divisible by 7");
			}
			else{
				System.out.println("The given number is not divisible by 7");
			}
		}
}
