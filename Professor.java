
public class Professor {
	String profName;
	int idNumber;
	String profDepartment;

	public Professor(String name, int id, String department) {
		this.profName = name;
		this.idNumber = id;
		this.profDepartment = department;

	}

	public String getName() {
		return profName;
	}
	
	public int getID(){
		return idNumber;
	}
	
	public String getDepartment(){
		return profDepartment;
	}
}

