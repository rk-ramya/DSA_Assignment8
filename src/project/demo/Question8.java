package project.demo;

public class Question8 {
	public boolean SwapStrings(String str, String goal) {
		if (str.length() != goal.length()) {
			return false;
		}
		if (str.equals(goal)) {
			int[] frequency = new int[26];
			for (char ch : str.toCharArray()) {
				frequency[ch - 'a']++;
				if (frequency[ch - 'a'] == 2) {
					return true;
				}
			}
			return false;
		}
		int a = -1;
		int b = -1;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != goal.charAt(i)) {
				if (a == -1) {
					a = i;
				} 
				else if (b == -1) {
					b = i;
				} 
				else {
					return false;
				}
			}
		}
		if (b == -1) {
			return false;
		}
		boolean result = str.charAt(a) == goal.charAt(b) && str.charAt(b) == goal.charAt(a);
		return result;
	}
}