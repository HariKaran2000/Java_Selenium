package String;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * String comparison
		 * == is used to compare the object
		 * equals is used to compare the values
		 * 
		 * Builder vs Buffer
		 * 
		 * if multiple threads can work on the same object at same time, its called as Multi threaded
		 * buffer does not support Multiple threading
		 * but builder supports
		 * 
		 * builder is faster vs buffer
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		String name = "Ajay"; //literal
		System.out.println(name); //Ajay
		name = name.concat("Mishra");
		System.out.println(name); // Ajay
		String abc = "Ajay";
		System.out.println(name.equals(abc)); //false
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s3 == s4); //false
		System.out.println(s3.equals(s4));//true
		
		
		//String buffer and builder
		System.out.println("Learning String Builder");
		StringBuilder builder = new StringBuilder("JAVA");
		System.out.println(builder);
		builder.append("Home");
		System.out.println(builder); //JAVAHOME
		System.out.println(builder.length());
		System.out.println(builder.reverse());
		
		//reverse a string using for loop without using reverse method

	}

}
