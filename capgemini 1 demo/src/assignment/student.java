package assignment;

public class student {
	
	String name ;
	int phno;
	String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student(); // obj to display Sam details
		obj.name = "sam";
		obj.phno = 11;
		obj.address = "chennai 77";
		
		student obj1 = new student();// obj1 to display john details
		obj1.name = "john";
		obj1.phno = 12;
		obj1.address = "mumbai 77";
		
		
		System.out.println("The following are the details of sam ");
		System.out.println("Name : "+obj.name);
		System.out.println("Phone number :" +obj.phno);
		System.out.println("Address :" +obj.address);
		System.out.println();
		System.out.println("The following are the details of John");
		System.out.println("Name : "+obj1.name);
		System.out.println("Phone number :" +obj1.phno);
		System.out.println("Address :" +obj1.address);
		
		
		

	}

}
