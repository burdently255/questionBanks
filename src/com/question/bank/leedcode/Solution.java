package com.question.bank.leedcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 15, 12, 11, 23, 0 };
		int target = 15;
		int[] result = Solution.twoSum(nums, target);
		for (int i : result) {
			System.out.println(i);
		}
		int[] result2 = Solution.twoSum2(nums, target);
		for (int i : result2) {
			System.out.println(i);
		}
	}

	/**
	 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
	 * ����Լ���ÿ�������Ӧ����𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
	 *
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				if (nums[k] == target - nums[i]) {
					map.put(i, k);
					System.out.println(nums[i] + ":" + nums[k]);
				}
			}
		}

		int[] result = new int[map.size() * 2];
		int count = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			result[count] = entry.getKey();
			count++;
			result[count] = entry.getValue();
			count++;
		}
		return result;
	}

	/**
	 * ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
	 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
	 *
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				if (nums[k] + nums[i] == target) {
					result[0] = i;
					result[1] = k;
					return result;
				}
			}
		}
		return result;
	}
}