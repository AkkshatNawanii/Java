package test.collections;

public class StringTest {
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	public static boolean isPalindrome(String s) {
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int length = cleaned.length();
		for (int i = 0; i < length / 2; i++) {
			if (cleaned.charAt(i) != cleaned.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
