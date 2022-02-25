package Encapsulationdemo;

public class apllication {
	/*
	 * private:can be accessed only within class
	 * default:can be accessed within the package 
	 * protected:can be accessed within the package and outside the package
	 * public: can be accessed from entire project
	 * 
	 * Naming conventions:
	 * Package : com.facebook.login // it will be in reverse
	 * Class : First letter is capital example; Employee
	 * Variables : CamelCase, First letter of 
	 * first word is small for remaining word first letter would be capital.
	 * Methods : same as variables
	 * make sue that all names are meaning full and sensible.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.setEmployeeName("HariKaran s");
		obj.setPhoneNo(884884744);
		obj.setSalary(25000);
		
		
		System.out.println("Employee name : "+  obj.getEmployeeName());
		System.out.println(obj.getDept());
		System.out.println(obj.getEmpId());
		System.out.println(obj.getSalary());
		System.out.println(obj.getPhoneNo());
		
		
	}

}
