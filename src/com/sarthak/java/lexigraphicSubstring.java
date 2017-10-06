package com.sarthak.java;
import java.util.SortedSet;
import java.util.TreeSet;

public class lexigraphicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/*Output Format
//
//		Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
//
//		Sample Input 0
//
//		welcometojava
//
//		3
//
//		Sample Output 0
//
//		ava
//
//		wel
//
//		Explanation 0
//
//		String has the following lexicographically-ordered substrings of length :*/

		String str = "welcometojava";

		int k=3;

		SortedSet<String> sets=new TreeSet<String>();

		for(int i=0;i<=str.length()-k;i++){

		sets.add(str.substring(i,i+k));

		}

		System.out.println(sets.first());

		System.out.println(sets.last());
	}

}
