package prograOneWeek6;

public class Clerk extends Employee {
	
	private String department;
	private String [] contractsSigned = new String [3];
	private int numContracts = 0;

	public Clerk(String name, String team, String department) {
		super(name, team, department);
		this.department = department;
		
	}
	/*
	//Previous example for print details
	public void printDetails() {
		super.printDetails();
		System.out.println();
		
	}*/
	
	//Second example with override
	@Override
	public void printDetails() {
		super.printDetails();
		
		System.out.println("Department: " + department);
		System.out.printf("Contracts signed: ");
		
		for (int i = 0; i < numContracts; i++) {
			System.out.print(contractsSigned[i] + " ");
		}
		System.out.println();
	}
	
	public boolean assignDesk(String desk) {
		//Check if location is valid fof Clerk
		if(desk.startsWith(department) == false && 
				desk.startsWith(super.getTeam()) == false) {
			return false;
		}
		else {
			super.assignDesk(desk);
			return true;
		}
			
	}

}
