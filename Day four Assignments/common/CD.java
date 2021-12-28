package com.common;

public class CD {
	String title;
	String singer;
	public CD(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return " title=" + title + ", singer=" + singer +"" ;
	}
	
}
