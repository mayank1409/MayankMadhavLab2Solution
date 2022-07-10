package com.gl.payumoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of transaction array :");
		int size = scanner.nextInt();

		int[] transactions = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the transaction for day " + (i + 1));
			transactions[i] = scanner.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved ");
		int totalTargets = scanner.nextInt();

		while (totalTargets > 0) {
			
			System.out.println("Enter the value of target");
			int target = scanner.nextInt();

			int transactionSum = 0;
			boolean isTragetAchieved = false;

			for (int i = 0; i < size; i++) {
				transactionSum += transactions[i];
				if (transactionSum >= target) {
					isTragetAchieved = true;
					System.out.println("Target achived after " + (i + 1) + " transactions");
					break;
				}
			}
			if (!isTragetAchieved) {
				System.out.println("Given Target was not achived!");
			}
			totalTargets--;
			System.out.println();
		}

		scanner.close();
	}
}
