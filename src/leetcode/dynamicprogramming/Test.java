package leetcode.dynamicprogramming;

import java.util.HashMap;

public class Test {

	static HashMap<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(fib(14));
	}
	public static int fib(int n) {
		if(n==0 ||  n==1) {
			return n;
		}
		if( memo.containsKey( n)) return memo.get(n);


		int ans = fib(n-1) + fib(n-2);
		memo.put(n , ans);
		return ans;
	}

}



