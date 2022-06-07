package Arrays_Strings;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] nums = { 2, 45, 60, 2, 14, 48 };

		Arrays.sort(nums);

		int sum = 0;
		for (int i = 1; i < nums.length -1; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);

	}

}
