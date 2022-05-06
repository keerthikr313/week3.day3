package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("6");
		int a=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).contains("1"))
			a=a+1;
		}
		System.out.println("The number of 1 in the list is " +a);

	}

}
