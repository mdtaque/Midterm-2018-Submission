package datastructure;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<String> country = new ArrayList<>();
		country.add("BD");
		country.add("UK");
		country.add("USA");

		for(String x : country){
			System.out.print(x + " ");
		}

		System.out.println();


		Iterator it = country.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("\nlast element added in arraylist: "+country.get(country.size() -1));

		//removing 1st element
		country.remove(0);

		System.out.println("after removing 1st element: "+country);

	}

}
