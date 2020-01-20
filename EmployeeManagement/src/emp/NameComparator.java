package emp;
import java.util.*;
public class NameComparator implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Student e1=(Student) o1;
		Student e2=(Student) o2;
		return e1.eName.compareTo(e2.eName);
	}

}
