import java.util.ArrayList;

public class Faculty {
	String facultyName;
	ArrayList<Professor> facultyList;

	public Faculty(String name, ArrayList<Professor> profs) {
		this.facultyName = name;
		this.facultyList = profs;
	}

	public void printList() {
		System.out.println("The faculty of " + facultyName + " contains: ");
		for (int i = 0; i < facultyList.size(); i++)
			System.out.println(facultyList.get(i).getName() + " ");
	}
}
