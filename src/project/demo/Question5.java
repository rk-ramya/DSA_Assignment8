package project.demo;

public class Question5 {
	public int compress(char[] input) {
		StringBuilder result = new StringBuilder("");

		for(int i=0; i<input.length; i++) {
			result.append(input[i]);
			int count = 1;

			while(i<input.length-1) {
				if(input[i] == input[i+1]) {
					count++;
					i++;
				}
				else {
					break;
				} 
			}

			if(count>1) {
				result.append(count);
			}
		}

		for(int j=0; j<result.length(); j++) {
			input[j] = result.charAt(j);
		}
		return result.length();
	}
}