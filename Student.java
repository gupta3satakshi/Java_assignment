package Assignment1;

public class Student {
	private String name;
	private int roll_no;
	
	// Default constructor
	public Student() {
		this.name = "May";
		this.roll_no = 23;
	}
	
	
	//parameterized constructor
	static int i = 0;
	public Student(String name) {
		this.name = name;
		this.roll_no = ++i;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_(int r) {
		roll_no = r;
	}
		public String toString() {
			return "Student name = " + name + ", roll_no = " + roll_no;
		}
		
}
