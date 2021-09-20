package com.greatlearning.services;

import java.util.HashMap;

public class CurrencyService {

	MergeSortImplementation mergeSort = new MergeSortImplementation();

	public void calculatesNotes(int[] currencies, int payableAmount) {

		mergeSort.sort(currencies, 0, currencies.length - 1);

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		
		int originalAmount = payableAmount;

		for (int i = currencies.length - 1; i >= 0; i--) {
			
			int currency = currencies[i];
			count = payableAmount / currency;

			if (count != 0) {
				//System.out.println(currencies[i] + ":" + count + "=" + currencies[i] * count);
				map.put(currency, count);
			}

			payableAmount = payableAmount % currencies[i];
		}

		if(payableAmount == 0) {
			System.out.println(map);
		}
		
		if (payableAmount == originalAmount && payableAmount > 0) {
			System.out.println("Notes cannot be calculated");
		}
		
		if(payableAmount > 0 && payableAmount != originalAmount) {
			System.out.println(map);
			//System.out.println("Original Amount: "+originalAmount);
			System.out.println("Remaining Amount: "+payableAmount);
		}
		
		

	}

}
