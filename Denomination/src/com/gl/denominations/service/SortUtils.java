package com.gl.denominations.service;

public class SortUtils {
	
	public static void sort(int[] currencyValues) {
		quickSort(currencyValues, 0, currencyValues.length - 1);
	}

	private static void quickSort(int[] currencyValues, int left, int right) {
		if (left < right) {
			int p_index = partition(currencyValues, left, right);
			quickSort(currencyValues, left, p_index - 1);
			quickSort(currencyValues, p_index + 1, right);
		}
	}

	private static int partition(int[] currencyValues, int left, int right) {
		int pivot = currencyValues[right];

		int i = left - 1;

		for (int j = left; j <= right - 1; j++) {
			if (currencyValues[j] > pivot) {
				i++;
				swap(currencyValues, i, j);
			}
		}

		swap(currencyValues, i + 1, right);

		return (i + 1);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
