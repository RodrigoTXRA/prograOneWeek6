package prograOneWeek6;

public class NewClerk {
	
	public static void main (String[] args) {
		Clerk c1 = new Clerk("John", "Research", "Finance");
		Clerk c2 = new Clerk("John", "Research", "Finance");
		c1.printDetails();
		c2.printDetails();
		
		System.out.println();
		
		boolean deskAssigned = c1.assignDesk("Research-F2-D0001");
		
		if (deskAssigned == true) {
			System.out.println("Desk assigned for " + c1.getName());
		}
		else {
			System.out.println("Error - desk is not with " + " team/department!");
		}
		
		System.out.println();
		c1.printDetails();
		
	}

}
