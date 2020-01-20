package emp;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map mp=new HashMap();
mp.put(1,"ram");
mp.put(2,"sam");
mp.put(3,"ham");
mp.put(4,"vam");
mp.remove(3);

Set set=mp.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
	Map.Entry e=(Map.Entry)itr.next();
	System.out.println(e.getKey()+""+e.getValue());
}
	}

}
