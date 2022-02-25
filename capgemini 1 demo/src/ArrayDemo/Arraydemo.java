package ArrayDemo;

public class Arraydemo {

	public static void main(String[] args) {
		/*
		 * Arrays:
		 * it is used to store multiple similar values
		 * 
		 * 3 parts
		 * 1. Declaration	>> int studentid[];
		 * 2. Instantiation >> studentid = new int[10]
		 * 3. Initialization>> studentid[0] = 1
		 * 
		 */
		
		int stuid[]; // declaration
		stuid = new int[5]; //  instantiation
		stuid[0] = 1;// initialization
		stuid[1] = 11;
		stuid[2] = 13;
		stuid[3] = 12;
		stuid[4] = 14;
		
		System.out.println("length of the array is : " +stuid.length);
		System.out.println(stuid[0]);
		System.out.println(stuid[1]);
		System.out.println(stuid[2]);
		System.out.println(stuid[3]);
		System.out.println(stuid[4]);
		
		
		// printing array using for loop
		int myid[] = new int[6]; // declaration and instantation at the same line
		int yourid[] = {12,23,44,448,43}; // declaration and instantation  and initalization at the same line
		

		myid[0]=1;
		myid[1]=2;
		myid[2]=3;
		myid[3]=4;
		myid[4]=5;
		myid[5]=6;
		
		System.out.println("printing array using for loop");
		for( int i = 0; i < myid.length; i++) {
			System.out.println(myid[i]);
		}
		
		// 2d arrays 

		int[][] collegeId = new int [2][3]; // 2d array declaration
		collegeId[0][0] = 1001;
		collegeId[0][1] = 1002;
		collegeId[0][2] = 2002;
		
		
		System.out.println("Learning 2d Arrays");
		for(int i =0; i < collegeId.length; i++) {
			for(int j = 0; j < collegeId[i].length; j++) {
				System.out.println(collegeId[i][j]);
			}
		
		
		
		
	}

}
}
