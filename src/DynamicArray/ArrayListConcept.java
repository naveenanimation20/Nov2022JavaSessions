package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//dynamic array:
		//ArrayList - default class
		//order based collection: it maintains the order/index
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4

		System.out.println(ar.size());//5
		
		ar.add("testing");//5
		ar.add(23.44);//6
		ar.add(true);//7
		ar.add('g');//8
		ar.add(1000);//9

		
		System.out.println(ar.size());//10
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(10));//IOB
		
		ar.remove(8);
		System.out.println(ar.get(8));
		
		System.out.println(ar.size());
		System.out.println(ar.get(7));
		System.out.println(ar);
		
		System.out.println("------");
		
		ArrayList empData = new ArrayList();
		empData.add("tom");//0
		empData.add("Bangalore");//1
		empData.add(1000);//2
		empData.add(true);//3
		
		System.out.println(empData.size());//4
		
		System.out.println(empData.get(1));
		
		System.out.println(empData);
		
		//for loop:
		for(int i=0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
		}

		for(Object e : ar) {
			
		}
		

	}

}


