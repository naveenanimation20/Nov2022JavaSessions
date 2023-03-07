package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);

		
		System.out.println(numList.size());

		//for each loop:
		for(Integer e : numList) {
			System.out.println(e);
		}
		
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Naveen");//0
		empNamesList.add("Tom");//1
		empNamesList.add("Peter");//2
		empNamesList.add(null);//3

		
		System.out.println(empNamesList.get(0));
		
		for(String e : empNamesList) {
			System.out.println(e);
		}

		System.out.println(empNamesList);
		
		
		//
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");//0
		empDataList.add(2);//1
		empDataList.add(true);//2
		empDataList.add(12.33);//3
		empDataList.add('m');
		empDataList.add(30);
		
		System.out.println(empDataList.get(2));
		
		
		empDataList.remove(12.33);
		
		for(Object e : empDataList) {
			System.out.println(e);
				if(e.equals(20)) {
					System.out.println("fresher");
				}
		}

		
	}

}
