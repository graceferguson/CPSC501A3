
public class Supervisor {
	String supName;
	Student student;

	public Supervisor(String name) {
		this.supName = name;
	}

	public void assignStudent(Student stud) {
		this.student = stud;
	}

	public String getStudent() {
		return student.getName();
	}

	public String getName() {
		return supName;
	}
}
