package com.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		
		String arr [] = { "xyz","abc","pqr"} ;
		
       List <String> nameArrayList =Arrays.asList(arr);
		
		System.out.println(nameArrayList.contains("xpq")); 
		
		
		
		
	}

}
