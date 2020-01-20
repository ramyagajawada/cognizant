package emp;

import java.util.*;

public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ec=new ArrayList();
		
		ec.add(new Student(11,"ram",34));
		ec.add(new Student(12,"ham",34));
		ec.add(new Student(15,"gam",54));
		ec.add(new Student(16,"sam",24));
		Collections.sort(ec,new NameComparator());
		
		Iterator itr=ec.iterator();
		
		while(itr.hasNext())
		{
			Student st=(Student) itr.next();
			System.out.println(st.eId+""+st.eName+""+st.age);
		}
	}

}
