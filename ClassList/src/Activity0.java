import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Activity0 {
	Map<String,String> classList = new HashMap<String,String>();

	public void classGrades() {
		classList.put("Bob", "A");
		classList.put("Marley","C");
		classList.put("Sarah","B");
		classList.put("Philip", "A");
		classList.put("Gerg","F");
	}
	public void printClassList() {
		Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
		Entry<String, String> entry = entries.next();
		System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	public void printClassList2() {
		for(Map.Entry<String, String> entry : classList.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		//iterating over keys only
		for (String Key : classList.keySet()) {
			System.out.println("Key = " + Key);
		}
		//iterating values only
		for (String value : classList.values()) {
			System.out.println("Value = " + value);
		}
	}
	public static void main(String[] args) {
		ClassGrades myClassList = new ClassGrades();
		myClassList.printClassList();
	}

}
