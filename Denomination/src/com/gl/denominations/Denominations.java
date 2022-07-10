package com.gl.denominations;

import java.util.Scanner;

import com.gl.denominations.service.SortUtils;

public class Denominations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int currencyDenominationSize = scanner.nextInt();

		int[] currencyValues = new int[currencyDenominationSize];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < currencyDenominationSize; i++) {
			currencyValues[i] = scanner.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();

		// Sort the currencyValues in descending Order
		SortUtils.sort(currencyValues);

		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for (int i = 0; i < currencyValues.length; i++) {
			int currencyValueCount = 0;
			while (amount >= currencyValues[i] && amount != 0) {
				amount = amount - currencyValues[i];
				currencyValueCount++;
			}
			if (currencyValueCount != 0) {
				System.out.println(currencyValues[i] + " : " + currencyValueCount);
			}
		}
		scanner.close();
	}

	
}
