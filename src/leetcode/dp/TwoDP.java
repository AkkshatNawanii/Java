package leetcode.dp;

import java.util.*;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class TwoDP {
	public List<Integer> list ;
	int length ;
	public  TwoDP(){
		list = new ArrayList<>();
		length = 0;
	}
	public void addNum(int num) {
		list.add(num);
		length++;
	}

	public double findMedian() {
		if(length %2 == 0){
			return (double) (list.get(length /2 )+ list.get((length /2)+1 )) /2 ;
		}else{
			return list.get((length /2 ) +1);
		}

	}
	public static void main(String[] args) {
		int[][] island = new int[][]{
				new int[]{0,0,1,0,0,0,0,1,0,0,0,0,0},
				new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
				new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0},
				new int[]{0,1,0,0,1,1,0,0,1,0,1,0,0},
				new int[]{0,1,0,0,1,1,0,0,1,1,1,0,0},
				new int[]{0,0,0,0,0,0,0,0,0,0,1,0,0},
				new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
				new int[]{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		System.out.println(maxAreaOfIsland(island));

	}
	public static  int maxAreaOfIsland(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int ans =  0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){

				if (!visited[i][j] && grid[i][j] == 1) {
					int area = dfs(grid, visited, i, j);
					ans = Math.max(ans, area);
				}
			}
		}
		return ans;
	}

	private static int dfs(int[][] grid, boolean[][] visited, int i, int j){
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
				visited[i][j] || grid[i][j] == 0) {
			return 0;
		}
		visited[i][j] = true;

		int area = 1;
		area += dfs(grid, visited, i + 1, j);
		area += dfs(grid, visited, i - 1, j);
		area += dfs(grid, visited, i, j + 1);
		area += dfs(grid, visited, i, j - 1);

		return area;
	}
}
