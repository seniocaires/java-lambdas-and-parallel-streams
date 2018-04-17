package chapter3;

import java.util.ArrayList;
import java.util.List;

import data.Person;
import data.Persons;

public class FixFilter {

	public static void main(String[] args) {

		System.out.println("Persons Less Than 20 Years");
		System.out.println("Age \t Name");
		for (Person person : getPersonsLessThan20Years(Persons.getInstance().getPersons())) {
			System.out.println(person.getAge() + " \t" + person.getGivenName() + " " + person.getSurname());
		}
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
