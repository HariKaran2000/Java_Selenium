package assignment;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager obj1 = new Manager();
		obj1.Name = "jacob";
		obj1.Age = 22;
		obj1.Address = "Bangalore";
		obj1.Phonenumber = 833898598;
		obj1.Salary = 23363;
		
		Employee obj2 = new Employee();
		obj2.Name = "Hari";
		obj2.Age = 21;
		obj2.Address = "Mangadu";
		obj2.Phonenumber = 739898598;
		obj2.Salary = 6663333;
		
		
		
		System.out.println("These objects are from Manager class");
		System.out.println("Manager Name : "+ obj1.Name);
		System.out.println("Age : " + obj1.Age);
		System.out.println("Address : "+ obj1.Address);
		System.out.println("phone number : "+ obj1.Phonenumber);
		System.out.println("Salary : "+ obj1.Salary);
		System.out.println("\n");
		System.out.println("These objects are from Employee class");
		System.out.println("Employee Name : " +obj2.Name);
		System.out.println("Age : " +obj2.Age);
		System.out.println("Address : " +obj2.Address);
		System.out.println("phone number : " +obj2.Phonenumber);
		System.out.println("Salary : " +obj2.Salary);

	}

}
