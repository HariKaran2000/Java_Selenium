package constructor;

public class variables {
	/*
	 * 1.Global variable--- declared inside a class but outside a method
	 * 		INSTANCE variable -- defined without a static keyqord
	 * 		Static variable -- defined with a static keyword
	 * 2. local variable -- any variable declared inside a class and inside a method
	 * From a static area you cannot access non static area
	 * 
	 */
	int studentId;
	static String studentName;
	static String collegeName;
	
	
	
	public void b1() {
		int id=155;
		System.out.println(id);
		
	}
	public static void showCollegeName() {
		System.out.println(collegeName);
	}

}
