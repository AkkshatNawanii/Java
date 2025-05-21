package test.collections;

import java.util.*;

public class StackTest {


	public static void main(String[] args) {

	}

	public int evalRPN(String[] tokens) {
		Stack<Integer> store = new Stack<>();
		for (String token : tokens){
			if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				int b = store.pop();
				int a = store.pop();
				switch (token) {
					case "+":
						store.push(a + b);
						break;
					case "-":
						store.push(a - b);
						break;
					case "*":
						store.push(a * b);
						break;
					case "/":
						store.push(a / b);
						break;
				}
			} else {
				store.push(Integer.parseInt(token));
			}
		}
		return store.pop();
	}

	public static boolean isValid(String s) {
		Stack<Character> check = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current == '(' || current == '{' || current == '[') {
				check.push(current);
			} else {
				if (check.isEmpty()) return false;
				char top = check.peek();
				if ((current == ')' && top == '(') ||
						(current == '}' && top == '{') ||
						(current == ']' && top == '[')) {
					check.pop();
				} else {
					return false;
				}
			}
		}
		return check.isEmpty();
	}


}
