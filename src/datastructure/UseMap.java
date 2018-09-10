package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityofBD = new ArrayList<String>();
		cityofBD.add("SYL");
		cityofBD.add("DHK");
		cityofBD.add("KHL");

		List<String> cityofUSA = new ArrayList<String>();
		cityofUSA.add("NY");
		cityofUSA.add("NJ");
		cityofUSA.add("FL");

		List<String> cityofUK = new ArrayList<String>();
		cityofUK.add("LONDON");
		cityofUK.add("CHELSEA");
		cityofUK.add("MENCHESTER");

		Map<String, List<String>> CountryNCity = new HashMap<String, List<String>>();
		CountryNCity.put("BD", cityofBD);
		CountryNCity.put("USA", cityofUSA);
		CountryNCity.put("UK", cityofUK);

		for (Map.Entry<String, List<String>> state : CountryNCity.entrySet()) {
			System.out.println(state.getKey() + "--> " + state.getValue());
		}

		Iterator<Map.Entry<String,List<String>>> it  = CountryNCity.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> x = it.next();
			System.out.println(x.getKey()+"--> "+x.getValue());
		}

	}

}
