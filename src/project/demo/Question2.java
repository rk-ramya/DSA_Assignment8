package project.demo;

public class Question2 {		
		Boolean checkValidString(String s) {
			int leftParenthesis = 0;
			int leftMax = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					leftParenthesis++;
					leftMax++;
				} else if (s.charAt(i) == ')') {
					leftParenthesis--;
					leftMax--;
				} else {
					leftParenthesis--;
					leftMax++;
				}
				if (leftMax < 0) {
					return false;
				}
				if (leftParenthesis < 0) {
					leftParenthesis = 0;
				}
			}
			if (leftParenthesis == 0) {
				return true;
			}
			return false;
		}
		
		public static void main(String ... args) {
			Question2 obj=new Question2();
			System.out.println(obj.checkValidString(")((()"));
	}
}