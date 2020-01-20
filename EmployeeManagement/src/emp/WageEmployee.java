package emp;

public class WageEmployee extends Employee1{
	int numbers;
	int hours;
	Address address;
	@Override
	public String toString() {
		return "WageEmployee [numbers=" + numbers + ", hours=" + hours + ", address=" + address + ", empId=" + empId
				+ ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	public WageEmployee(Address address, Address address2) {
		super(address);
		address = address2;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	
	
	
	
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
public WageEmployee(Address address,int empId, String empName, int empSalary, int numbers, int hours) {
		super(empId, empName, empSalary);
		this.numbers = numbers;
		this.hours = hours;
		this.address=address;
	}
int calculateSalary()
{
	return numbers*hours;
}

}
