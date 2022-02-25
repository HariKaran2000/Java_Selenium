package practice;

public class StudentDetails  {
	public static void main(String[] args) {
		int i,flag = 0,m = 0; 
		int num = 211;
		
		m = num / 2;
		
		if(num == 0 || num == 1) {
			System.out.println(num  +  "is not a prime number");
			
		}
		for (i = 2; i<m;i++) {
			if(num % i == 0) {
				System.out.println(num  +  "is not a prime number");
				flag = 2;
				break;
			}
		}
			if(flag == 0)
			{
				System.out.println(num + "is a prime number");
				
			}
		}
		
		 
		
}

