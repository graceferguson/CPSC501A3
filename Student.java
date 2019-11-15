
public class Student {
	String studName;
	Supervisor supervisor;
	

	public Student(String name) {
		this.studName = name;

	}

	public void assignSupervisor(Supervisor sup) {
		this.supervisor = sup;
	}

	public String getName() {
		return studName;
	}
	
	public String getSupervisor(){
		return supervisor.getName();
	}
		

}