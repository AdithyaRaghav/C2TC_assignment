package Assignment1;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import com.tnsif.assignmentone.employee.Manager;
		import com.tnsif.assignmentone.employee.Developer;
		import com.tnsif.assignmentone.utilities.EmployeeUtilities;

		/**
		 * Main class to demonstrate Employee, Manager, Developer, and Utilities.
		 */
		public class AssignmentMain {
		    public static void main(String[] args) {
		        Manager mgr = new Manager("Alice", 101, 90000, "IT");
		        Developer dev = new Developer("Bob", 102, 70000, "Java");

		        System.out.println("=== Manager Details ===");
		        EmployeeUtilities.printEmployeeDetails(mgr);
		        System.out.println("Department: " + mgr.getDepartment());

		        System.out.println("\n=== Developer Details ===");
		        EmployeeUtilities.printEmployeeDetails(dev);
		        System.out.println("Programming Language: " + dev.getProgrammingLanguage());

		        System.out.println("\n=== Salary Update ===");
		        EmployeeUtilities.giveRaise(dev, 10);
		    }
		}
	}

}
