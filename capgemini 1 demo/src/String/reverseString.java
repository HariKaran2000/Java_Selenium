package String;
import java.util.Scanner;
public class reverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
         
		String input = sc.nextLine();
		
		
		
		char[] try1 = input.toCharArray();
		 
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
		 
	}

}
