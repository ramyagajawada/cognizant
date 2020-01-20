package com;

import java.io.*;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
	{
	FileInputStream fin=new FileInputStream("D:\\fileex.txt");
	fin.read();
	fin.close();
	System.out.println("sucssss");
	}
catch(Exception e){

	System.out.println(e);
	}
}
}


