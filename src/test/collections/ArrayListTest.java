package test.collections;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Monday","Tuesday");
		List<String> list1 = new ArrayList<>(list);
		String[] arr = {"Monday", "Tuesday"} ;
		List<String> list2 = new ArrayList<>(List.of(arr));

		list.set(1, "Wednesday");
		list1.add("Wednesday");
		list2.add("Wednesday");

		System.out.println(list);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list.getClass().getName());
		System.out.println(list1.getClass().getName());
		System.out.println(list2.getClass().getName());

//		System.out.println(arr.indexOf(5));
//		arr.add(0,5);
//		System.out.println(arr.indexOf(5));
//
//		System.out.println(isAnagram("rat", "tar"));
//
//		System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
//
//		System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));


	}

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;

		HashMap<Character, Integer> seen = new HashMap<>();

		for( int i = 0; i < s.length() ; i++  ){
			seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i),0)+1);
			seen.put(t.charAt(i), seen.getOrDefault(t.charAt(i),0)-1);
		}

		if( seen.isEmpty()) return true;
		System.out.println(seen);
		return true;
	}

	public static  int[] productExceptSelf(int[] arr){
		int[] prod = new int[arr.length];
		int l = 1;
		for(int i =0; i<arr.length; i++){
			prod[i] = l;
			l*= arr[i];
		}
		int r = 1;
		for(int i =arr.length -1 ; i>= 0; i--){
			prod[i] *= r;
			r*= arr[i];
		}

		return prod ;


	}

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> check = new HashSet<>();
		for ( int num : nums){
			check.add(num);
		}
		int longestStreak = 0;
		for ( int num : check){
			int streak = 0;
			if(check.contains(num -1)) continue;

			while( true){
				if(check.contains(num)) streak ++;
				else break;
				num++;
 			}
			if (streak > longestStreak ) longestStreak = streak;
		}

		return longestStreak;

	}


}
