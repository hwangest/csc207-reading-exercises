

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;

	public Student(String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

	/**
	 * Sets the string for the first name of student
	 * 
	 * @param name first name of student
	 */
	public void setFirstName(String name) {
		this.firstName = name;
	}

	/**
	 * Gets string of first name of student.
	 * 
	 * @return first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the string for the last name of student.
	 * 
	 * @param name last name of student.
	 */
	public void setLastName(String name) {
		this.lastName = name;
	}

	/**
	 * Gets string of last name of student.
	 * 
	 * @return last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of id of student.
	 * 
	 * @param n the new, non-negative value of id.
	 */
	public void setId(int n) {
		this.id = n;
	}

	/**
	 * Gets the value of id of student.
	 * 
	 * @return id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of age of student
	 * 
	 * @param n the new, non-negative value of age
	 */
	public void setAge(int n) {
		this.age = n;
	}

	/**
	 * Gets the value of age of student.
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
	}

}