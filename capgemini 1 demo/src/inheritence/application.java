package inheritence;

public class application {
	public static void main(String[] args) {
		//parent class obj
		parentclassdemo obj = new parentclassdemo();
		obj.parentName = "hari";
		obj.breakfast();
		obj.dinnerTime();
	    System.out.println(obj.parentName);
	    
	    //child class onj
		childclassdemo obj1 = new childclassdemo();
		obj1.lunch();
		obj1.breakfast();// method pointing to parent class
		obj1.drinksBreak();
		
		// sibling class obj
		siblingclassdemo obj2 = new siblingclassdemo();
		obj2.parentName = "sam";
		obj2.breakfast(); // another child class extends to parents class
		System.out.println(obj2.parentName);
		
		// method overloading
		methodoverloading objoverloading = new methodoverloading();
		objoverloading.showInfo();
		objoverloading.showInfo("hari");
		
	
		
		int total = objoverloading.sum(10, 34);
		System.out.println(total);
	}

}
