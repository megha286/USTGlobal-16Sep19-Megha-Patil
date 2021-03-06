package com.ustglobal.streams.list;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(40);
		al.add(32);
		al.add(23);
		
		List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		for(Integer i:l) {
			System.out.println(i);
		}
	}
}
