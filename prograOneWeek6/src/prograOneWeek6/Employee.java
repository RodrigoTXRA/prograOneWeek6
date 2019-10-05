package prograOneWeek6;

public class Employee {

	// INSTANCE variables for the employees
	private String name;
	private String team;
	private String position;
	private String deskNumber;

	// CONSTRUCTOR has to have the same name as the class
	public Employee(String name, String team, String position) {
		this.name = name;
		this.team = team;
		this.position = position;
		this.deskNumber = "TBC";
	}

	// ACCESSORS used to access the
	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}

	public String getDeskNumber() {
		return deskNumber;
	}

	public boolean assignDesk(String desk) {
	     if (desk.isEmpty())
	          return false;
	     else
	    {
	         this.deskNumber = desk;
	         return true;
	    }
	}

	// HELPER METHOD to print employee details
	public void printDetails() {
		System.out.printf("%-10s%s\n", "Name", name);
		System.out.printf("%-10s%s\n", "Team", team);
		System.out.printf("%-10s%s\n", "Position", position);
		System.out.printf("%-10s%s\n", "Desk", deskNumber);
	}

}

