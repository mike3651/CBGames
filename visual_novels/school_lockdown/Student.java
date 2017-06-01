
public class Student extends Humanoid {
	/* Fields for the student class */
	private int age;

	/* Student constructor 
	 * 
	 * @param name The name of the student
	 * @param age The age of the student */
	public Student(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int combat(Humanoid other) {
		return 1;
	}

	public String saying() {
		return "lol";
	}
}