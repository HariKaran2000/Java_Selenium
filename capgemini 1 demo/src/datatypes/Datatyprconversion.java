package datatypes;                                  // 13/09/2021 //

public class Datatyprconversion {

	public static void main(String[] args) {
		/*
		 *bucket theory 
		 *bucket 1 = capacity -> 5L
		 *bucket 2 = capacity ->3L
		 *transfer from bucket 1 to bucket 2 -> Loss of water -- Asking confirmation -- Finally doing it.
		 *transfer from bucket 2 to bucket 1 -> no problem  
		 */
		short x1 = 5;
		int x2 = x1;
		System.out.println(x2);
		// short to int , int to short , long to float , Float to long ,
		
		// int to short 
		int a = 4;
		short a2 = (short) a;
		System.out.println(a2);
		
		//long to float 
		long B1 = 133;
		float c1 = (float) B1;
		System.out.println(c1);
		
		//Float to long ,
		float f1 = 122.44f;
		long b3 = (long) f1;
		System.out.println(b3);
		
		// byte to int
		byte c = 1;
		int n1 = c;
		System.out.println(n1);
		
		//double to float
		double d = 1222.888;
		float f = (float) (d);
		System.out.println(f);
		
		// float to double
		float A1 = 133.1f;
		double D1 = A1;
		System.out.println(D1);
		
		// char to int
		char A = 'p';
		int J =  A;
		System.out.println(J);
		
		// int to char //
		int A5 = 65;
		char J1 = (char) (A5);
		System.out.println(J1);
		
		
		// string to integer -- integer to string//
		
		
		String cookie = "123";
		int good = Integer.parseInt(cookie);
		System.out.println(good);
		System.out.println(cookie);
		
		int sam = 1234;
		String jack = Integer.toString(sam);
		System.out.println(sam); //888
		System.out.println(sam + 10);//898
		System.out.println(jack);//888
		System.out.println(jack + 10);//88810
		System.out.println(10 + 20 + jack + 10); // 30 + jack +10 == 30123410
		
		
		String  name = "69420";
		int str1 = Integer.parseInt(name);
		System.out.println(name);
		System.out.println(str1 + 400);
		

	}

}
