package Testing;

import DataStructures.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array<Integer> example = new Array<Integer>();
		boolean x = example.contains(5);
		example.add(5);
		boolean y = example.contains(5);
		System.out.println("Before Adding 5: " + x + "\nAfter Adding 5: " + y);		//Works!
		

	}

}
