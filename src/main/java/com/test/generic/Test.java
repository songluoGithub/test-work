package com.test.generic;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str = "1,2,3,4,";
		String[] strArr = str.split(",",-1);
		System.out.println(Arrays.toString(strArr));
	}
}
