package chapter3;

import data.Person;

public class YoungerThanCondition implements Condition<Person> {

	private final int _age;

	YoungerThanCondition(int age) {
		_age = age;
	}

	@Override
	public boolean test(Person person) {
		return person.getAge() < _age;
	}
}
