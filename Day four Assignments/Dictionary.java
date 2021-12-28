package com.kiran.program;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
	public static void main(String[] args) {
		Map<String,String> words=new TreeMap<String,String>();
		words.put("set", "The set interface is present in java.util package and extends the Collection interface is an unordered collection of objects in which duplicate values cannot be stored.");
		words.put("list", "List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the duplicate elements also. We can also store the null elements in the list.");
		words.put("map", "A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a word");
		String word=scan.nextLine();
		
		Set<String> wordss=words.keySet();
		
		for(String word1:wordss) {
			if(word.equals(word1))
			System.out.println(word+" \t"+words.get(word1));
		}
	}
	
}
