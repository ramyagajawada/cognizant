package com;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader =new FileReader("D:\\fileex2.txt");
		BufferedReader buffer=new BufferedReader(reader);
		buffer.read();
		buffer.close();
		System.out.println("success");
	}

}
