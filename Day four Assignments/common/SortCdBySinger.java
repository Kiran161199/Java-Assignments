package com.common;

import java.util.Comparator;

public class SortCdBySinger implements Comparator<CD> {

	@Override
	public int compare(CD o1, CD o2) {
		// TODO Auto-generated method stub
		return o2.singer.compareTo(o1.singer);
	}

}
