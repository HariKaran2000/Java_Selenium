package constructor;              //15/09/2021//

public class loopingdemo {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		// for loop
		System.out.println("for loop");
		for(int i=1; i<=10; i++) {
			
			System.out.println(i);
			

		}
		// while
		int i = 5;
		System.out.println("While loop");
		while(i <= 10) {
			
			System.out.println(i);
			i++;
			
		}
		
		// do while
		 i=1;
		System.out.println("do while loop");
		do{
			System.out.println(i);
			i++;
		}while(i < 5);
		
		//switch
		 int day = 4;
		    switch (day) {
		      case 1:
		        System.out.println("Monday");
		        break;
		      case 2:
		        System.out.println("Tuesday");
		        break;
		      case 3:
		        System.out.println("Wednesday");
		        break;
		      case 4:
		        System.out.println("Thursday");
		        break;
		      case 5:
		        System.out.println("Friday");
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		        System.out.println("Sunday");
		        break;
		      default:System.out.println("not found");
		    }
		    
		    //if else if
		    for(i=1;i<=7;i++) {
		    	if(i==5) {
		    		System.out.println("five");
		    		break;
		    		
		    	}else {
		    		System.out.println(i);
		    	}
		    }
}
}