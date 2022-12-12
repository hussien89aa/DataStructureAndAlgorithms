package com.search;

import static java.lang.System.*;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet data = new DataSet(1000000);
		int Search = 9999;
		Boolean IsFound = false;
		for (int i = 0; i < data.getSize(); i++) {
			if (data.data[i] == Search) {
				out.println("Element is found after "
						+ (i + 1) + "  try");
				IsFound = true;
				break;
			}
		}
		if (IsFound == false) {
			out.println("number isn't found");
		}

	}

}
