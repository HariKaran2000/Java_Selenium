package constructor;                 // 14/09/2021 //

public class students {
	// constructor : There is a default constructor for all class
	//its the same name as the class name
	//constructor name should be same as class name
	public students () {
		System.out.println("hi im a  students constructor");
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
	
	
	public students(int studentid, String name) {
		System.out.println("Im a parameterrized constructor");
		id = studentid;
		this.name = name;
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
	
	
    

	public students(String gender, int age) {
	
		System.out.println("This is another parameterized constructor");

		this.gender = gender;
		this.age = age;
		System.out.println(this.gender);
		System.out.println(this.age);
		System.out.println();
		
		
	}




	int id;
	String name;
	String gender;
	int age;

}
