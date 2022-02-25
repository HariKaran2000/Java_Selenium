package inheritence;

public class methodoverloading {
	
	public void showInfo() {
		System.out.println("showInfo method without parameters");
		
	}

	public void showInfo(String Name) {
		System.out.println("showInfo method with parameters");
		
	}
	public int sum(int a,int b) {
		//implementation or method body
		System.out.println("addition of the 2 numbers is:");
		int total = a+b;
		return total;
	}
}
