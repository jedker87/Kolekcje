package nowaKolekcja;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Double D = new Double(1.5); 
		List<Person> people;

		people = new ArrayList<>();    
 
		people.add(new Person("Andrzej", "Andrzej@o2", 80));
		people.add(new Person("Krzysztof", "XXX@o2", 60));

		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		people.remove(new Person("Krzysztof", "XXX@o2", 60));
		for (Person tmp2 : people) {
			System.out.println(tmp2);
		}


	}
}
