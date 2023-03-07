package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {

		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Tom");//0
		namesList.add("Peter");//1
		namesList.add("Rashmi");//2
		namesList.add("Ravi");//3
		namesList.add("Naveen");//4
		
		
//		for(int i=namesList.size()-1; i>=0; i--) {
//			System.out.println(namesList.get(i));
//		}
		
		System.out.println(namesList);
		//Collections.reverse(namesList);
		//Collections.sort(namesList);
		//Collections.swap(namesList, 2, 3);
		
		
		//namesList.add("Amrita");
		//namesList.add(0, "Kath");
		//namesList.add(7, "Vinutha");//IOB
		//System.out.println(namesList.get(5));//IOB

		namesList.remove(1);
		System.out.println(namesList.get(1));
		System.out.println(namesList);

		
		
		
		
		
	}

}
