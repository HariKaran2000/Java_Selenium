package constructor;

public class application {
	

	public static void main(String[] args) {
		students st1 = new students();
		students st2 = new students(2,"Hari");
		st1.gender= "male";
		System.out.println(st1.gender);
		
		variables var1 = new variables();
		var1.collegeName="iit";
		var1.studentId=2;
		var1.studentName="hari";
		System.out.println(var1.collegeName);
		System.out.println(var1.studentId);
		System.out.println(var1.studentName);
		variables var2 = new variables();
		var2.collegeName="vel";
		var2.studentId=3;
		var2.studentName="karur";
		System.out.println(var2.collegeName);
		System.out.println(var2.studentId);
		
		variables.showCollegeName();
		variables.collegeName = "oot";
		variables.showCollegeName();
		
	
		
	}

}
