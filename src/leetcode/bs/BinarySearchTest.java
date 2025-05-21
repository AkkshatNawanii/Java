package leetcode.bs;

public class BinarySearchTest {
	public static void main(String[] args) {
		System.out.println(search(new int[]{-1,0,5},-1));
		System.out.println(searchMatrix(new int[][]{
				new int[]{1, 3, 5, 7},
				new int[]{10, 11, 16, 20},
				new int[]{23, 30, 34, 60}
		}, 10));
	}

	public static int search(int[] nums, int target) {
		if(nums.length == 1 && nums[0] == target) return 0;
		int left =0, right = nums.length -1;

		while(right >= left) {
			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid -1;
			} else left = mid + 1;
		}
		return -1;
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		for ( int[] arr : matrix){
			if(( arr[0] <= target) && (arr[arr.length -1 ] >= target)){
				int left =0;
				int right = arr.length -1;
				while(right >= left) {
					int mid = (left + right) / 2;

					if (arr[mid] == target) {
						return true;
					} else if (arr[mid] > target) {
						right = mid -1;
					} else left = mid + 1;
				}
			}
		}

		return false;
	}

//	public int minEatingSpeed(int[] piles, int h) {
//
//	}
}
