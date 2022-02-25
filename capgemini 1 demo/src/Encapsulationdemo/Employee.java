package Encapsulationdemo;

public class Employee {
	
	
	private String EmployeeName;
	private int EmpId;
	private String Dept;
	private int salary;
	private int phoneNo;
	
	
	public String getEmployeeName() {
		
		return EmployeeName;
	}
	public int getEmpId() {
		EmpId = 23;
		return EmpId;
	}
	public String getDept() {
		Dept = "Cse";
		return Dept;
	}
	public int getSalary() {
		return salary;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void doProject() {
		System.out.println("My project is on services");
	}
	
	

}
