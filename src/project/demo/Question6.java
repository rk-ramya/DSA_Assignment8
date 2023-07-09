package project.demo;

import java.util.Arrays;

public class Question6 {

	static void search(char[] pattern, char[] Str)
	{
		int m1 = Str.length, m2 = pattern.length;
		char[] sortedpat = pattern;
		Arrays.sort(sortedpat);
		String temp;
		for (int i = 0; i <= m1 - m2; i++) {
			temp = "";
			for (int k = i; k < m2 + i; k++)
				temp += Str[k];
			char tempArray[] = temp.toCharArray();
			Arrays.sort(tempArray);
			temp = new String(tempArray);

			if (String.valueOf(sortedpat).equals(temp))
				System.out.println("Found at Index " + i);
		}
	}

	public static void main (String[] args) {
		String txt = "cbaebabacd";
		String pat = "abc";
		search(pat.toCharArray(), txt.toCharArray());
	}
}
