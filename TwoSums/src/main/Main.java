package main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	static Map<Integer, Integer> complements = new HashMap<>();

	public static void main(String[] args) {

		int nums[] = new int[] { 7, 9, 5, 2 };
		int target = 20;
		
		twoSums(nums, target);

	}

	public static int[] twoSums(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			Integer complementIndex = complements.get(nums[i]);
			if (complementIndex != null) {
				System.out.printf("The numbers at index: %d(%d) and %d(%d) sums to %d%n", complementIndex, nums[complementIndex], i, nums[i], target);
				return new int[] { complementIndex, i };
			} else {
				complements.put(target - nums[i], i);
			}
		}
		System.out.println("There are no matching numbers!");
		return new int[] {};

	}

	/*
	 * {7, 9, 5, 2} -> 14
	 * 
	 * 
	 */

}
