package data;
import java.util.List;

public class Person {

	private String surname;
	private String givenname;
	private Integer age;
	private Gender gender;
	private boolean vendor;
	private List<Transaction> buying;
	private List<Transaction> selling;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Transaction> getBuying() {
		return buying;
	}

	public void setBuying(List<Transaction> buying) {
		this.buying = buying;
	}

	public List<Transaction> getSelling() {
		return selling;
	}

	public void setSelling(List<Transaction> selling) {
		this.selling = selling;
	}

	public boolean isVendor() {
		return vendor;
	}

	public void setVendor(boolean vendor) {
		this.vendor = vendor;
	}
}
