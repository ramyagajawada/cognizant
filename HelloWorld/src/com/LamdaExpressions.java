package com;

import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

interface Addable
{
	int add(int a,int b);
}
interface Sayable
{
	
	String say(String string);
}
public class LamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda expressions without return keyword
Addable add1=(a,b)->(a+b);
System.out.println(add1.add(10,40));
//lambda expressions with return keyword
	Addable add2=(int a,int b)->{return(a+b);};
	System.out.println(add2.add(10, 60)); 
	//using for each loop n lambda functions
	List<String> list=new ArrayList<String>();
	list.add("ramya");
	list.add("harshu");
	list.add("sindhu");
	list.add("ash");
	list.forEach((n)->System.out.println(n));
	//multiple statements in lambda expression
	Sayable person=(message)->{
		String s1="hello here";
		String s2=s1+message;
		return s2;
		};
		System.out.println(person.say("tiem"));
	
	}

}
