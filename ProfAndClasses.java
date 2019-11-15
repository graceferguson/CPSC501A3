
public class ProfAndClasses {
	String profName;
	int[] classList;

	public ProfAndClasses(String name, int[] classes) {
		this.profName = name;
		this.classList = classes;

		System.out.println(profName + " teaches ");
		for (int i = 0; i < 3; i++) {
			System.out.print(classes[i] + " ");
		}
		System.out.print("\n");
	}
	
	

}
