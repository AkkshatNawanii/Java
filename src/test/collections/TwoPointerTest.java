package test.collections;

import java.util.*;

public class TwoPointerTest {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
		System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
		System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));

	}

	public static int maxArea(int[] height) {

		int maxArea = 0;
		int left = 0;
		int right = height.length -1;

		while (right > left){
			maxArea = Math.max(Math.min(height[left],height[right]) * (right-left) , maxArea);
			if(height[left] > height[right]) right--;
			else left++ ;

		}
		return maxArea;
	}

	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length -1 ;

		while (right > left){
			int sum =  numbers[left] +  numbers[right]  ;
			if (sum == target){
				return new int[]{left+1 , right+1};
			} else if (sum < target) {
				left ++ ;
			}else{
				right--;
			}
		}
		return new int[]{-1,-1};

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) continue;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					res.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (left < right && nums[left] == nums[left + 1]) left++;
					while (left < right && nums[right] == nums[right - 1]) right--;
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}

		return res;
	}

//	public static int trap(int[] height) {
//
//	}
}
