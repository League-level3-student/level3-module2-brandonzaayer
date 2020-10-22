package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean isSorted = false;
		int i = 0;
		int j = 1;
		while (isSorted == false) {
			Random ran1 = new Random();
			int r1 = ran1.nextInt(array.length);
			Random ran2 = new Random();
			int r2 = ran2.nextInt(array.length);
			while (ran1 == ran2) {
				r2 = ran2.nextInt(array.length);
			}
			if (array[r1] > array[r2]) {
				int temp = array[r1];
				array[r1] = array[r2];
				array[r2] = temp;
				display.updateDisplay();
			}
			if (array[i] < array[j]) {
				i++;
				j++;
			}
		}
	}
}
