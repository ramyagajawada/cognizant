package emp;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	public int compare(Object o1,Object o2){
		
		Student e1=(Student) o1;
		Student e2=(Student) o2;
		if(e1.age==e2.age)
			return 0;
		else if(e1.age>e2.age)
			return 1;
		else 
			return -1;
	}

}
