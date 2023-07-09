package project.demo;

import java.util.HashMap;

public class Question3 {

	static int lengthCommon(String str1, String str2, int m, int n)
	{
		int result[][] = new int[m + 1][n + 1];
		int i, j;

		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					result[i][j] = 0;

				else if (str1.charAt(i - 1)
						== str2.charAt(j - 1))
					result[i][j] = result[i - 1][j - 1] + 1;

				else
					result[i][j] = Math.max(result[i - 1][j],
							result[i][j - 1]);
			}
		}
		return result[m][n];
	}
	static void displayMinDeletions(String str1,
			String str2)
	{
		int m = str1.length();
		int n = str2.length();

		int len = lengthCommon(str1, str2, m, n);

		System.out.println("Minimum number of "
				+ "deletions => ");
		System.out.println(n - len);
	}
	public static void main(String[] args)
	{
		String str1 = new String("sea");
		String str2 = new String("eat");
		displayMinDeletions(str1, str2);
	}
}
