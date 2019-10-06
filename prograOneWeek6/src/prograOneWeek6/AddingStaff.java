package prograOneWeek6;

public class AddingStaff {
	
	public static void main (String[] args) {
		Clerk c1 = new Clerk("John", "Research", "Finance");
		
		
		CallCentreOp cc01 = new CallCentreOp("James", "Research", "Melbourne", null);
		cc01.printDetails();
		
		System.out.println();
		
		Manager m1 = new Manager ("Jessica", "Research", "Manager");
		m1.printDetails();
		System.out.println();
		
		boolean deskAssigned = c1.assignDesk("Research-F2-D0001");
		
		if (deskAssigned == true) {
			System.out.println("Desk assigned for " + c1.getName());
		}
		else {
			System.out.println("Error - desk is not with " + " team/department!");
		}	
		
		c1.printDetails();
		System.out.println();
		
	}

}
