package com.search;

public class DataSet {
	int[] data;

	public DataSet(int size) {
		data = new int[size];
		for (int i = 1; i <= size; i++)
			data[i - 1] = i;
	}

	public int getSize() {
		return data.length;
	}

}
