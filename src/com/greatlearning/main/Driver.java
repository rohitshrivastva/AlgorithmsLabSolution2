package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.CurrencyService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations ");
		int countOfDenominatedCurrencies = sc.nextInt();
		
		if(countOfDenominatedCurrencies > 0 ) {
			int[] currencies = new int[countOfDenominatedCurrencies];
			System.out.println("Enter the currency denominations value");

			for (int i = 0; i < currencies.length; i++) {
//				do {
//					currencies[i] = sc.nextInt();
//				}while(currencies[i] <= 0);
				
//
				currencies[i] = sc.nextInt();
				if(currencies[i] <= 0) {
					System.out.println("Please enter amount > 0 again");
					currencies[i] = sc.nextInt();
				}
			}

			System.out.println("Enter the amount you want to pay");
			int payableAmount = sc.nextInt();
					
			new CurrencyService().calculatesNotes(currencies, payableAmount);

		}else {
			System.out.println("Please try with the correct input");
		}
			
				
		sc.close();

	}

}
