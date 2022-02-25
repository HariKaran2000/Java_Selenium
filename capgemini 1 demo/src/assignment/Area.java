package assignment;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length: ");
        l=sc.nextInt();
        System.out.println("Enter Breadth: ");
        b=sc.nextInt();
        Area obj=new Area();
        System.out.println("Area of Rectangle:"+Area.returnArea(l,b));
    }
    public static int returnArea(int x,int y) 
    {
       return x*y;
    }


	}


