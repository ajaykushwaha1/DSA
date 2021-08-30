package com.dsa.array.search.impl;

import com.dsa.array.search.Arrays;

public class ArraysImpl implements Arrays {

	@Override
	public Integer linearSearch(Integer[] a, Integer key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	@Override
	public Integer linearSearch(Long[] a, Long key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	@Override
	public Integer linearSearch(Byte[] a, Byte key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
	
	@Override
	public Integer linearSearch(Object[] a, Object key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

}
