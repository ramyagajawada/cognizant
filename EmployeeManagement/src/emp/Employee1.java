package emp;
import java.util.*;
public class Employee1 implements Comparable<Employee> {
	int empId;
	String empName;
	int empSalary;
	Address address;

	public Employee1(int empId)
	{
		
		this.empId=empId;
	}
	public int compareTo(Emploee e2){
		return empId.compareTo(e2.empId);
	}
}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", address=" + address
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee1(Address address) {
		super();
		this.address = address;
	}

	public Employee1(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address= address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public class Employee1
	{
		int empId;
		String empName;
		int empSalary;
		Address address;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e=new Employee1(12,"ramy",45);
		System.out.println(e.getEmpId());
	System.out.println(e.getEmpName());
	System.out.println(e.getEmpSalary());
	System.out.println(e.getAddress());
	ArrayList<Employee1> e4=new ArrayList<Employee1>();
	e4.add(new Employee1(567));
	
Collections.sort(e4);
for(Employee1 e1:e4) {
	System.out.println(e1.empId);
}
	}
	@Override
	public int compareTo(Employee1 arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
