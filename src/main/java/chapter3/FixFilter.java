package chapter3;

import java.util.ArrayList;
import java.util.List;

import data.Person;

public class FixFilter {

	public static void main(String[] args) {

		getPersonsLessThan20Years(new ArrayList<Person>());
	}

	public static List<Person> getPersonsLessThan20Years(List<Person> persons) {
		List<Person> result = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() < 20) {
				result.add(person);
			}
		}
		return result;
	}
}
