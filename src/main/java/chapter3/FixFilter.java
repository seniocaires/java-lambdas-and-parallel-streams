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
		
		System.out.println("Persons Between 30 and 40 Years Old");
		System.out.println("Age \t Name");
		for (Person person : getPersonsByAgeRange(Persons.getInstance().getPersons(), 30, 40)) {
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

	public static List<Person> getPersonsByAgeRange(List<Person> persons, int from, int to) {
		List<Person> result = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() >= from && person.getAge() <= to) {
				result.add(person);
			}
		}
		return result;
	}
}
