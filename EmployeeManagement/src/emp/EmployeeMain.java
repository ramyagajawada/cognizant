package emp;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WageEmployee e=new WageEmployee(new Address(45,"usdgwsj",45), 67,  "ramya", 033, 5, 6);
System.out.println(e.calculateSalary());
System.out.println(e);

	}

}
