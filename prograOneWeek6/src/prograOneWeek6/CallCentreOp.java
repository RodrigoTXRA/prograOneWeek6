package prograOneWeek6;

public class CallCentreOp extends Employee{
	
	private String location;
	private String[] callsAssigned = new String[3];
	private int numCalls = 0;

	public CallCentreOp(String name, String team, String position, String location) {
		super(name, team, position);
		this.location = location;
	
					
		}
	@Override
	public void printDetails() { 	
		super.printDetails();
		System.out.println("Location: " + location);
		
		System.out.printf("Calls assigned: ");
		
		for (int i = 0; i <numCalls; i++) {
			System.out.print(callsAssigned[i]+ " ");
		}
		
		System.out.println();
	}

}
