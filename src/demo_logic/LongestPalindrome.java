package demo_logic;

public class LongestPalindrome {
	// O(n^2)
		public static String longestPalindromeString(String s) {
			if (s == null) return null;
			String longest = s.substring(0, 1);
			System.out.println("Longest :"+longest);
			for (int i = 0; i < s.length() - 1; i++) {
				//odd cases like 121
				String palindrome = intermediatePalindrome(s, i, i);
				System.out.println("palindrome :"+palindrome);
				if (palindrome.length() > longest.length()) {
					longest = palindrome;
				}
				//even cases like 1221
				palindrome = intermediatePalindrome(s, i, i + 1);
				System.out.println("palindrome1 :"+palindrome);
				if (palindrome.length() > longest.length()) {
					longest = palindrome;
				}
			}
			return longest;
		}
		static public String intermediatePalindrome(String s, int left, int right) {
			if (left > right) return null;
			while (left >= 0 && right < s.length()
					&& s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
			return s.substring(left + 1, right);
		}


	public static void main(String[] args) {
		//System.out.println(longestPalindromeString("1234"));
		//System.out.println(longestPalindromeString("12321"));
		System.out.println(longestPalindromeString("1234567890"));
		//System.out.println(longestPalindromeString("9912333321456"));
		//System.out.println(longestPalindromeString("12145445499"));
		//System.out.println(longestPalindromeString("1223213"));
		//System.out.println(longestPalindromeString("abb"));
	}

	
	
}
