package com;
import java.util.*;
public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> e=new ArrayList();
e.add("String");
e.add("fdka");
e.add("ramyaramyaramyaramyaramya");
System.out.println(e);
ArrayList<String> e1=new ArrayList();
e1.add("h");
e1.add("i");
e.remove(e1);
System.out.println(e);
e.remove(2);
System.out.println(e);
System.out.println(e.isEmpty());
e.retainAll(e1);



	}

}
