package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
		Collections.sort(list);
		System.out.println("Sorted list values are "+list);
		
		Integer duplicate1= list.get(list.size() -3);
		Integer duplicate2= list.get(list.size() -5);
		Integer duplicate3= list.get(list.size() -9);

		System.out.println("Duplicate values are "+duplicate1);
		System.out.println("Duplicate values are "+duplicate2);
		System.out.println("Duplicate values are "+duplicate3);

		
	}

}
