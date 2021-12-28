package com.kiran.program;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TelephoneDirectroy {
	public static void main(String[] args) {
		Map<String,Long> phone=new TreeMap<String,Long>();
		phone.put("rocky", 9988667755l);
		phone.put("rahul", 9933667755l);
		phone.put("kiran", 9988227755l);
		phone.put("mantu", 9933661155l);
		phone.put("ram", 9988667455l);
		phone.put("madhu", 9933667735l);
		System.out.println("Name"+"\t\t"+"Phone NO");
		
		Set<String> contact=phone.keySet();
		for(String name:contact)
		{
			System.out.println(name+"\t\t"+phone.get(name));
		}
	}

}
