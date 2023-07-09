package project.demo;

public class Question1 {
	    public int minimumDeleteSum(String s1, String s2) {
	        int n = s1.length(), m = s2.length();
	        int ASCII_total = 0;

	        for (int i = 0; i < n; i++)
	            ASCII_total += s1.charAt(i);
	        
	        for (int i = 0; i < m; i++) 
	            ASCII_total += s2.charAt(i);

	        int[][] input = new int[n+1][m+1];

	        int result = ASCII_total;
	        for (int row = 0; row < n+1; row++) {
	            for (int column = 0; column < m+1; column++) {
	                if(row == 0 || column == 0)
	                    input[row][column] = ASCII_total;
	                else if (s1.charAt(row-1) == s2.charAt(column-1)){
	                    input[row][column] = input[row-1][column-1] - 2*s1.charAt(row-1);
	                    result = Math.min(result, input[row][column]);
	                }else {
	                    input[row][column] = Math.min(input[row-1][column], input[row][column-1]);
	                }
	            }
	        }

	        return result;
	    }
	}