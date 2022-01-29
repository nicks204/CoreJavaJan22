package oops;

public class Employee {
	
	public String Name;
	public int EmployeeId;
	private static int Salary = 1000;
	private static String CompanyName = "Infosys";
	
	
	public Employee() {
		
		
	}
	
	public Employee(String Name,int EmployeeId, int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;		
	}
	
	public Employee(String Name,int EmployeeId) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		
	}
	
	public void PrintName() {
		
		System.out.println("Name of employee is " + this.Name);
	}
	
	public void PrintSalary() {
		
		System.out.println("Salary of employee is " + Employee.Salary);
		System.out.println("Company of employee is " + Employee.CompanyName);
	}
	
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Infosys Technology";
	}
	
	
}
