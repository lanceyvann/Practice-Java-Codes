import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner jw = new Scanner(System.in);
    System.out.println("Problem Set 6: Employee Performance System\n");

	  String employeeName, employeeID;
	  double basicSalary, performanceScore;
	
  	System.out.print("Enter Employee Name: ");
  	employeeName = jw.nextLine();

  	System.out.print("Enter Employee ID: ");
	  employeeID = jw.nextLine();

  	System.out.print("Enter Basic Salary: ");
	  basicSalary = jw.nextDouble();

  	System.out.print("Enter Performance Score: ");
  	performanceScore = jw.nextDouble();

	  Manager manager = new Manager(employeeName, employeeID, basicSalary, performanceScore);
	  manager.displayEmployeeInformation();
    }
}
