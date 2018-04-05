package com.training.filesreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class files {

	public static void main(String[] args)
	{
		
		long val1 = 9999999999L;
		int val2 = (int) val1;
		
		System.out.println("val1 : "+val1+", "+"val2 : "+val2+"\n");
		
		Float a = 2.33f;
		Double b = 3.44;
		
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		File file = new File("C:\\Users\\PRAVEENKUMAR\\Desktop\\filereadingtemptemp.txt");
		boolean result = file.exists();
		System.err.println("result : "+result);
		
		System.out.println("\ncurrent directory : "+System.getProperty("user.dir"));
		
		try {
			InputStream input = new FileInputStream("textfile1.txt");
			OutputStream output = new FileOutputStream("temp.txt");
			int intvalue1;
			
			while ((intvalue1=input.read())>=0) {
				char charvalue1 = (char) intvalue1;
				System.out.println(charvalue1+", "+Character.getNumericValue(intvalue1)+", "+Character.isDigit(charvalue1));
				output.write(charvalue1);
			}
			
			input.close();
			output.close();
		}
		catch (Exception e) {
			System.out.println("received exception : "+e);
		}
		
		try {
			Reader reader = new FileReader("textfile2.txt");
			Writer writer = new FileWriter("textfile3.txt");
			int intvalue2;
			
			while ((intvalue2=reader.read()) >= 0) {
				char charvalue2 = (char) intvalue2;
				System.out.println(charvalue2+", "+intvalue2+", "+Character.isDigit(charvalue2));
				writer.write(charvalue2);
			}
			
			reader.close();
			writer.close();
		}
		catch (Exception e) {
			System.out.println("received exception : "+e);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("textfile2.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("textfile4.txt"));
			
			int intvalue3;
			
			while ((intvalue3=br.read()) >= 0) {
				char charvalue3 = (char) intvalue3;
				System.out.println(charvalue3+", "+intvalue3+", "+Character.isDigit(charvalue3));
				bw.write(charvalue3);
			}
			
			br.close();
			bw.close();
		}
		catch (Exception e) {
			System.out.println("received exception : "+e);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("textfile2.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("textfile5.txt"));
			
			String value4;
			
			while ((value4=br.readLine()) != null) {
				System.out.println(value4);
				bw.write(value4);
			}
			
			br.close();
			bw.close();
		}
		catch (Exception e) {
			System.out.println("received exception : "+e);
		}
	}
}
