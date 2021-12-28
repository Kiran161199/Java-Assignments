package com.common;

import java.util.TreeSet;

public class SortCdMain {
	public static void main(String[] args) {
		CD cd1=new CD("KGF","Vijayprakash");
		CD cd2=new CD("Tagaru","Ravi Basur");
		CD cd3=new CD("Seetha rama kalyana","Arman malik");
		CD cd4=new CD("Puspa","Sid sri ram");
		CD cd5=new CD("The villan","Shankar");
		System.out.println("Sorting in Descending order ");
		TreeSet<CD> t=new TreeSet<CD>(new SortCdByTitle());
		t.add(cd1);
		t.add(cd2);
		t.add(cd3);
		t.add(cd4);
		t.add(cd5);
		for(CD ce:t) {
			System.out.println(ce);
		}
		System.out.println("------------------------------");
		System.out.println("Sorting in Ascending order");
		TreeSet<CD> t1=new TreeSet<CD>(new SortCdBySinger());
		t1.add(cd1);
		t1.add(cd2);
		t1.add(cd3);
		t1.add(cd4);
		t1.add(cd5);
		for(CD ce1:t1) {
			System.out.println(ce1);
		}
	}
}
