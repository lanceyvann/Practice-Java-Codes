public class Employee {
	private String employeeName, employeeID;
	private double basicSalary;

	public Employee(String employeeName, String employeeID, double basicSalary) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.basicSalary = basicSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
}
