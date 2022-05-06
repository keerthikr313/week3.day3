package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		//arrange the array in ascending order
		Collections.sort(list);
		System.out.println("Sorted list values are "+list);
		
		//pick the 2nd element from last and print it
		Integer second = list.get(list.size() -2);
		System.out.println("The second element from the last is "+second);

		
	}

}
