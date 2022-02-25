package abstarctclassdemo;

public class SBI implements RBI {
	@Override
	public void depositMoney() {
		System.out.println("Depositing Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Withdrawing Money");
		
	}

	@Override
	public void giveInterest() {
		System.out.println("Interest Rate is 4 percent");
		
	}

}
