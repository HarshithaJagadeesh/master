package com.hcl.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.hcl.model.ArrayListEx;

public class ArrayListService {
	
	public List<Integer> mergingSorting(ArrayListEx arrayList){
		
		arrayList.getList1().addAll(arrayList.getList2());
		Collections.sort(arrayList.getList1());		
		return arrayList.getList1();
		
	}
	
	public  List<Integer> getAtCertainIndex (List<Integer> arrayList) {
		
		List<Integer> integers = new ArrayList<>();
		integers.add(arrayList.get(2));
		integers.add(arrayList.get(6));
		integers.add(arrayList.get(8));
		
		return integers;
		
	}

}
