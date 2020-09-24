package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	public static boolean intArraySorted(int[] nums) {
		for (int i = 0; i <= nums.length-1; i++) {
			for (int j = i + 1; j < nums.length-1; j++) {
				if (nums[i] > nums[j]) {
					return false;
				}
			}
		}
		return true;
	}

// 2. Write a static method called doubleArraySorted.
// This method takes in an array of doubles
// and it returns a boolean.
// The method returns true if the double
// array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[] doubles) {
		for (int i = 0; i <= doubles.length-1; i++) {
			for (int j = i + 1; j < doubles.length-1; j++) {
				if (doubles[i] > doubles[j]) {
					return false;
				}
			}
		}
		return true;
	}

// 3. Write a static method called charArraySorted.
// This method takes in an array of characters
// and it returns a boolean.
// The method returns true if the character
// array is in alphabetical order and false otherwise
// (You can compare characters just like integers)
	public static boolean charArraySorted(char[] chars) {
		for (int i = 0; i <= chars.length-1; i++) {
			for (int j = i + 1; j < chars.length-1; j++) {
				if (chars[i] > chars[j]) {
					return false;
				}
			}
		}
		return true;
	}

// 4. Write a static method called stringArraySorted.
// This method takes in an array of Strings
// and it returns a boolean.
// The method returns true if the String
// array is in alphabetical order and false otherwise
// (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[] strings) {
		for (int i = 0; i <= strings.length-1; i++) {
			for (int j = i + 1; j < strings.length-1; j++) {
				if (strings[i].compareTo(strings[j]) > 0) {
					return false;
				}
			}
		}
		return true;
	}
}