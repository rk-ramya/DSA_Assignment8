package project.demo;

import java.util.ArrayList;

public class Question7 {
		public String decodeString(String s) {
			ArrayList<Integer> nums= new ArrayList<Integer>();
			ArrayList<StringBuilder>strBuild=new ArrayList<>();
			StringBuilder str = new StringBuilder();
			ArrayList<Integer> arr;
			int num=0;
			for(char c:s.toCharArray()){
				if(c>='0' && c<='9'){
					num=num*10 +c -'0';
				}
				else if(c=='['){
					strBuild.add(str);
					str=new StringBuilder();
					nums.add(num);
					num=0;
				}else if(c==']'){
					StringBuilder temp=str;
					str=strBuild.remove(strBuild.size()-1);
					int count=nums.remove(strBuild.size()-1);
					while(count-->0){
						str.append(temp);
					}
				}else{
					str.append(c);
				}
			}
			return str.toString();
		}   
	}
