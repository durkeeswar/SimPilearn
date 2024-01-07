package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		
		System.out.println(map1);
		
		// update the value of already present item
		map1.put("Item3", 300);
		System.out.println(map1);
		
		// find the price of item4 from map
		System.out.println("price of item4 is " + map1.get("Item4"));
		
		// remove item2 from the map
		map1.remove("Item2");
		System.out.println(map1);
	}

}

