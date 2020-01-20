package com;
import java.io.*;
public class FileRead
{
	public static void main(String ar[]) throws Exception
	{
		FileWriter writer =new FileWriter("D:\\plain1.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write("welcome");
		buffer.close();
		System.out.println("success");
	}
}