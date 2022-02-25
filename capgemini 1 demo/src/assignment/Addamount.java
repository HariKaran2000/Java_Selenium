package assignment;

public class Addamount {
	int amount = 50;
	
	public void addamount() {
		System.out.println("The amount remains same in the piggibank:"+amount );
	}
	public void addamount(int a) {
		amount = a + amount;
		System.out.println("The amount amount gets updated in the piggibank:"+amount );
	}
	public void finalamount() {
		System.out.println("The final amount is " + amount);
	}

}