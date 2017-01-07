package com.ds.hash;

public class Entry {
int key;
Object value;
Entry next;
	public Entry(int key,Object value) {
		this.key=key;
		this.value=value;
		next=null;
	}
	public Entry(){
		next=null;
	}
	public int GetKey(){
		return key;
	}
	public Object GetValue(){
		return value;
	}
}
