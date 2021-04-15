package com.hcl.model;

import java.util.List;

import com.hcl.service.ArrayListService;

public class ArrayListEx {
	
	private List <Integer> list1;
	private List <Integer> list2;
	
	public ArrayListEx() {
		super();
	}

	public ArrayListEx(List<Integer> list1, List<Integer> list2) {
		super();
		this.list1 = list1;
		this.list2 = list2;
	}

	public List<Integer> getList1() {
		return list1;
	}

	public void setList1(List<Integer> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}
	
}
