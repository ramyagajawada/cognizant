public class Employee
{
public int empId;
public String empName;
public int empSalary;
public Employee()
{
	empId=1;
	empName="ramya";
	empSalary=1;
}
public Employee(int empId,String empName,int empSalary )
{
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
}
//abstraction and encapsulation
//member menthods of employee
	void setEmployee(int id,String name,int salary)
	{
	this.empId=id;
	this.empName=name;
	this.empSalary=salary;
	}
void getEmployee()
{
System.out.print(""+empId+""+empName+""+empSalary);
}
int calSalary()
{
return empSalary+500;
}
}

