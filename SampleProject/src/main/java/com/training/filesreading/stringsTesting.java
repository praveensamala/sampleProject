package com.training.filesreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class stringsTesting
{
	private static final int VAR1;
	
	static {
		VAR1 = 20;
	}
	
	public static void main(String args[])
	{
		System.out.println("program arguments");
		System.out.println("args length : "+args.length);
		for (String x:args) {
			System.out.println("x : "+x);
		}
		
		System.out.println();
		System.out.println("system arguments");
		System.out.println(System.getProperty("Systemargument1"));
		System.out.println(System.getProperty("Systemargument2"));
		System.out.println(System.getProperty("Systemargument3"));
		
		System.out.println();
		System.out.println();
		
		/*String name = "testing";
		System.out.println("length : "+name.length());
		String newname = name.concat(" again");
		System.out.println("newname : "+newname);
		newname = newname.replace("again", "no");
		System.out.println("newname : "+newname);
		System.out.println("newname : "+newname.toLowerCase());
		System.out.println("newname : "+newname.toUpperCase());
		String newnamearr[] = newname.split(" ");
		System.out.println("length of newnamearr : "+newnamearr.length);
		System.out.println("newname : "+newname.charAt(0));
		System.out.println("newname : "+newname.substring(2, 5));
		System.out.println("newname : "+newname.contains("no"));
		System.out.println("newname : "+newname.endsWith("no"));
		System.out.println("newname : "+newname.startsWith("testing"));
		System.out.println("newname : "+newname.indexOf("n"));
		System.out.println("newname : "+newname.lastIndexOf("n"));*/
		
		/*String text = "ab2353425kijhwert0937^*(&*(&*(&*(&45jklsdjfklsdjfc123 xyz";
		int length = text.length();
		for (int i=0; i<length; i++) {
			//System.out.println(text.charAt(i));
			char letter = text.charAt(i);
			if (Character.isDigit(letter)) {
				System.out.println(letter);
			}	
		}
		
		StringBuilder sb = new StringBuilder(10);
		System.out.println("sb capacity : "+sb.capacity());
		sb.append("hello i am in testing");
		System.out.println("sb : "+sb);
		System.out.println("sb capacity : "+sb.capacity());*/
		
		//System.out.println("var1 : "+VAR1);
		
		/*environment env = environment.STAGE;
		
		System.out.println(env.toString());
		System.out.println(env.name());
		env = env.PROD;
		System.out.println(env.toString());
		System.out.println(env.name());*/

		/*List<String> list = new ArrayList<String>();
		list.add("hello");
		
		ArrayList list2 = new ArrayList();
		list2.add("hello");
		List aa = new ArrayList();
		aa.add("what");*/
		
		ArrayList list1 = new ArrayList();
		list1.add("denver");
		list1.add("englework");
		
		for (Object o:list1) {
			System.out.println(o.toString());
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("denver");
		list2.add("englework");
		
		for (String a:list2) {
			System.out.println(a);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("2222", "ghi");
		map.put("3333", "abc");
		map.put("1111", "def");
		
		System.out.println(map.get("3333"));
		System.out.println(map.get("9999"));
		System.out.println(map.getOrDefault("9999", "xyz"));
		
		System.out.println(map.toString());
		
		SortedMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("2222", "ghi");
		map2.put("3333", "abc");
		map2.put("1111", "def");
		map2.put("1000", "abc");
		System.out.println(map2.toString());
		System.out.println(map2.values());
		System.out.println(map2.keySet());
		
		String names[] = {"apple", "mango"};
		System.out.println("before : "+names[1]);
		arraychange(names);
		System.out.println("after : "+names[1]);
		
		try {
			System.out.println("inside the try");
		}
		catch (Exception e) {
			System.out.println("inside the exception");
		}
		finally {
			System.out.println("this always gets executed");
		}
		
	}
	
	public static void arraychange(String names[]) {
		names[1] = "updated mango";
	}
}
