package com.common;

import java.util.Comparator;

public class SortCdByTitle implements Comparator<CD>{
	

	@Override
	public int compare(CD o1, CD o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}

}
