package com.kiran.program;

import java.util.HashSet;
import java.util.Set;

public class DaysInAWeek {
	public static void main(String[] args) {
		Set<String> week=new HashSet<String>();
		week.add("Sunday");
		week.add("Monday");
		week.add("Tuesday");
		week.add("Wednesday");
		week.add("Thursday");
		week.add("Friday");
		week.add("Saturday");
		
		System.out.println(week.size());
		
		Object[] days=week.toArray();
		for(Object day:days)
		{
			System.out.println(day);
		}
	}

}
