
//CPSC501A3
//Grace Ferguson
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectCreator {

	Scanner intKeyboard = new Scanner(System.in);
	Scanner stringKeyboard = new Scanner(System.in);

	public ObjectCreator() {
	}

	public ArrayList<Object> createObjects() {

		ArrayList<Object> objList = new ArrayList<Object>();
		
		while (true) {

			System.out.println("Select an option: ");
			System.out.println("Select 1 to create a Professor");
			System.out.println("Select 2 to create a Student and Supervisor pair");
			System.out.println("Select 3 to create a Professor and Classes");
			System.out.println("Select 4 to create a Department");
			System.out.println("Select 5 to create a Faculty");
			System.out.println("Select 6 to quit");

			int entry = intKeyboard.nextInt();

			if (entry == 1) {
				System.out.println("Enter a Name:");
				String name = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id = intKeyboard.nextInt();

				System.out.println("Enter a department");
				String department = stringKeyboard.nextLine();

				Professor prof = new Professor(name, id, department);

				System.out.println("Name: " + prof.getName());
				System.out.println("ID: " + prof.getID());
				System.out.println("Department: " + prof.getDepartment());

				objList.add(prof);

			} else if (entry == 2) {
				System.out.println("Enter a Supervisor Name:");
				String name1 = stringKeyboard.nextLine();

				Supervisor sup = new Supervisor(name1);

				System.out.println("Enter a Student Name:");
				String name2 = stringKeyboard.nextLine();

				Student stud = new Student(name2);

				sup.assignStudent(stud);
				stud.assignSupervisor(sup);

				System.out.println(sup.getName() + " is supervising " + sup.getStudent());
				System.out.println(stud.getName() + " is supervised by " + stud.getSupervisor());

				objList.add(sup);
				objList.add(stud);

			} else if (entry == 3) {
				System.out.println("Enter a Name:");
				String name = stringKeyboard.nextLine();

				System.out.println("Enter three class numbers: ");

				int[] classes = new int[3];
				classes[0] = intKeyboard.nextInt();
				classes[1] = intKeyboard.nextInt();
				classes[2] = intKeyboard.nextInt();

				ProfAndClasses pAndC = new ProfAndClasses(name, classes);

				objList.add(pAndC);

			} else if (entry == 4) {

				System.out.println("Enter a Department Name");
				String department = stringKeyboard.nextLine();

				System.out.println("Now we will create three professors");

				System.out.println("Enter a Name:");
				String name1 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id1 = intKeyboard.nextInt();

				Professor prof1 = new Professor(name1, id1, department);

				System.out.println("Enter a Name:");
				String name2 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id2 = intKeyboard.nextInt();

				Professor prof2 = new Professor(name2, id2, department);

				System.out.println("Enter a Name:");
				String name3 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id3 = intKeyboard.nextInt();

				Professor prof3 = new Professor(name3, id3, department);

				Professor[] profList = new Professor[3];
				profList[0] = prof1;
				profList[1] = prof2;
				profList[2] = prof3;

				Department dep = new Department(department, profList);

				dep.printList();

				objList.add(dep);

			} else if (entry == 5) {

				System.out.println("Enter a Faculty Name");
				String faculty = stringKeyboard.nextLine();

				ArrayList<Professor> profList = new ArrayList<Professor>();

				System.out.println("Now we will create three professors");

				System.out.println("Enter a Name:");
				String name1 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id1 = intKeyboard.nextInt();

				Professor prof1 = new Professor(name1, id1, faculty);
				profList.add(prof1);

				System.out.println("Enter a Name:");
				String name2 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id2 = intKeyboard.nextInt();

				Professor prof2 = new Professor(name2, id2, faculty);
				profList.add(prof2);

				System.out.println("Enter a Name:");
				String name3 = stringKeyboard.nextLine();

				System.out.println("Enter an ID number");
				int id3 = intKeyboard.nextInt();

				Professor prof3 = new Professor(name3, id3, faculty);
				profList.add(prof3);

				Faculty facu = new Faculty(faculty, profList);
				facu.printList();

				objList.add(facu);

			} else if (entry == 6) {
				return objList;
			}

			else
				System.out.println("invalid entry");

		}

	}

}
