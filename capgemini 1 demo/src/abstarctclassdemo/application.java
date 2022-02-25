package abstarctclassdemo;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI();
		obj.depositMoney();
		obj.giveInterest();
		obj.withdrawMoney();
		
		HDFC obj1 = new HDFC();
		obj1.depositMoney();
		obj1.buyShares();
		obj1.sellShares();
		

	}

}
