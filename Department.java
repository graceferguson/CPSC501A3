
public class Department {
	String depName;
	Professor[] profList;

	public Department(String department, Professor[] list) {
		this.depName = department;
		this.profList = list;
	}

	public void printList() {

		System.out.println("The " + depName + " department contains: ");
		for (int i = 0; i < profList.length; i++) {
			System.out.println(profList[i].getName());
		}
	}
}
