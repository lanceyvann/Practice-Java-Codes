public class Manager extends Employee {
	private double performanceScore;

	public Manager(String employeeName, String employeeID, double basicSalary,double performanceScore) {
		super(employeeName, employeeID, basicSalary);
		this.performanceScore = performanceScore;
	}

	public double getPerformanceScore() {
		return performanceScore;
	}

	public String performanceClassification() {
		if (getPerformanceScore() >= 90) {
			return "Excellent";
		} else if (performanceScore >= 80 && performanceScore < 90){
			return "Good";
		} else if (performanceScore >= 70 && performanceScore < 80) {
			return "Satisfactory";
		} else {
			return "Needs Improvement";
		}
	}

	public double managerBonus() {
		if (getPerformanceScore() >= 90) {
			return getBasicSalary()*0.2;
		} else if (performanceScore >= 80 && performanceScore < 90){
			return getBasicSalary()*0.15;
		} else if (performanceScore >= 70 && performanceScore < 80) {
			return getBasicSalary()*0.1;
		} else {
			return getBasicSalary()*0;
		}
	}

	public double finalSalary() {
		return getBasicSalary() + managerBonus();
	}

	public void displayEmployeeInformation() {
		System.out.println("\nEMPLOYEE INFORMATION");
		System.out.println("Employee name: " + getEmployeeName());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Salary: Php" + getBasicSalary());

		System.out.println("\nPERFORMANCE");
		System.out.println("Score: " + getPerformanceScore());
		System.out.println("Classification: " + performanceClassification());

		System.out.println("\nPAYMENT");
		System.out.println("Bonus: Php" + managerBonus());
		System.out.println("Total Salary: Php" + finalSalary());
	}
}
