package emp;
import java.util.*;
 class Employee8 implements Comparable<Employee8> {
	public static int empId;
	public String empName;
	public int empSalary;
	public Address address;
	public Employee8(int empId){
	
		
		this.empId=empId;
	}
	public int compareTo(Employee8 e2){
		return this.empId-e2.empId;
	}
}
 
public class CollectionUser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee8> e4=new ArrayList<Employee8>();
		e4.add(new Employee8(78));
		Collections.sort(e4);
	for(Employee8 e2:e4) {
		System.out.println(e2.empId);
	}
	}
}



