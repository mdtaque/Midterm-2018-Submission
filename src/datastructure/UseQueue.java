package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> name = new LinkedList<>();
		name.add("David");
		name.add("Sara");
		name.add("Zaya");

		System.out.println("the peek element is: "+name.peek());
		System.out.println(name.poll());

		for(String x : name){
			System.out.println(x);
		}

		Iterator it = name.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		name.remove();
		System.out.println("after removing head 1st element: "+name.peek());

		//removing head of queue elements
		name.remove();
	}


}
