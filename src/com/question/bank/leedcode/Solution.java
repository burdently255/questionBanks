package com.question.bank.leedcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 */

class Solution {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 15, 12, 11, 23, 0 };
		int target = 15;
		int[] result = Solution.twoSum(nums, target);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			for (int k = i+1; k < nums.length; k++) {
				if (nums[k] == target - nums[i] ) {
					map.put(i, k);
					System.out.println(nums[i]+"+"+nums[k]);
				}
			}
		}

		int[] result = new int[map.size()*2];
		int count = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			result[count] = entry.getKey();
			count++;
			result[count] = entry.getValue();
			count++;
		}
		return result;
	}

	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			int res = target - j;
			for (int k = 0; k < nums.length; k++) {
				int m = nums[k];
				if (m == res && i != k) {
					result[count] = i;
					result[count++] = k;
					break;
				}
			}
		}
		return result;
	}
}