package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class ArrayPracticeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * how to sort list
		 * convert list to array
		 * convert array to list
		 * add all elements of one list to another using for loop
		 * 
		 * create a list and find the maximum and minimum element
		 */
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(21);
		list1.add(22);
		list1.add(244);
		list1.add(771);
		list1.add(38);
		
		System.out.println("Before Sorting : " + list1);
		Collections.sort(list1);
		System.out.println("after sorting : "+ list1);// sorted list
		Collections.max(list1);
		System.out.println("Maximum value of list1 is : "+ Collections.max(list1));//max
		Collections.min(list1);
		System.out.println("Minimum value of list1 is : "+ Collections.min(list1));//min
		
		
		
		
		// converting List to Array
		
		Integer[] Array1 = new Integer[list1.size()];
		Array1 = list1.toArray(Array1); 
		System.out.println("This is the converted list to Array");
		for(Integer i : Array1) {
			
			System.out.println(i);
			
		}
		// array to list
		 String[] stringArray = {"item 1", "item 2", "item 3", "item 4"};
	        List<String> stringList = new ArrayList(Arrays.asList(stringArray));
	        System.out.println("This is the converted Array to list");

	        for (String listItem : stringList) {
	            System.out.println(listItem);
		
		}
	       
	        

}
}
