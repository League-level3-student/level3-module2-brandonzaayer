package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] strings = {"one", "two", "three", "four"};
		int index = _00_LinearSearch.linearSearch(strings, "three");
		assertEquals(index, 2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] nums = {1, 2, 3, 4, 5};
		int index = _01_BinarySearch.binarySearch(nums, 1, 5, 4);
		assertEquals(index, 3);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] nums = {1, 2, 3, 4, 5};
		int index = _02_InterpolationSearch.interpolationSearch(nums, 4);
		assertEquals(index, 3);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
