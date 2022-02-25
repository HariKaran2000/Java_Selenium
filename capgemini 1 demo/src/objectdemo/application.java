package objectdemo;                          //13/09/2021//

public class application {
	public static void main(String[] args) {
		//create an object
		student stud1 = new student();
		stud1.DoHomeWork();
		stud1.StudName = "Nayan";
		stud1.age = 23;
		student stud2 = new student();
		stud2.StudName = "Rahul";
		System.out.println(stud1.age);
		System.out.println(stud1.StudName);
		System.out.println(stud2.StudName);
		//using object you can access all the variables and 
		//method of that class.
	}


}
