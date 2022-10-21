package com.methodindustries.problems;
//Write a function that reverses a string.
//The input string is given as an array of characters s.

//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

//Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]

public class reverseString {
	 public static String run(char[] s) {
 		char[] revs=new char[s.length];
 		for (int i=0; i<s.length;i++) {
 			char tempchar=s[i];
 			revs[s.length-i-1]=tempchar;
 		}
 		String returnstring=new String (revs);
 		return returnstring;
 

 	}

	
}
