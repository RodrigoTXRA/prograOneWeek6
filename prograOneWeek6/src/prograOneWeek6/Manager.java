package prograOneWeek6;

public class Manager extends Employee{
	
	private Employee[] directReports = new Employee[5];
	
	private int numReports = 0;
	

	public Manager(String name, String team, String position) {
		super(name, team, position);
		
	}
	@Override
	public void printDetails() {
		super.printDetails();
		
		System.out.println("Direct employee reporsts: ");
		
		for (int i = 0; i < numReports; i++) {
			System.out.println(directReports[i].getName() + 
					directReports[i].getClass());
		}
		
		System.out.println();
	}
	
	

}
