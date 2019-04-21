package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class UnrepeatLongestSubstr {
	public int lengthOfLongestSubstring00(String s) {
		if(s.length()==0||s==null)
			return 0;
		int maxLen=1,record=0;
		for(int i=1;i<s.length();i++) {
			int len=1;
			for(int j=i-1;j>=record;j--) {
				if(s.charAt(i)==s.charAt(j)) {
					record=j+1;
					break;
				}	
				else
					len++;
			}
			maxLen=Math.max(maxLen, len);
		}
		return maxLen;
	}
	public int lengthOfLongestSubstring0(String s) {
		 int len=0;
		 Set<Character> sub=new HashSet<>();
		 int i=0,j=0;
		 while(i<s.length()&&j<s.length()) {
			 if(sub.contains(s.charAt(j))) {
				 sub.remove(s.charAt(i++));
			 }
			 sub.add(s.charAt(j));
			 j++;
			 len=Math.max(len, j-i); 
		 }
		 return len;
	 }
	 public int lengthOfLongestSubstring(String s) {
		 int len=0;
		 Map<Character,Integer> sub=new HashMap<>();
		 int i=0,j=0;
		 while(i<s.length()&&j<s.length()) {
			 if(sub.containsKey(s.charAt(j))) {
				 //应该保证滑动窗口的起始位置依次向前，不能倒退
				 i=Math.max(i, sub.get(s.charAt(j))+1);//Math.max的作用 考虑 字符串abba这个例子
			 }
			 sub.put(s.charAt(j), j);
			 j++;
			 len=Math.max(len, j-i);
			 
		 }
		 return len;
	 }
	 public static void main(String[] args) {
		 String str="";
		 System.out.println(str.length());
		 System.out.println(new UnrepeatLongestSubstr().lengthOfLongestSubstring00(str));
		/*	 sub.add(str.charAt(i));
		 for(Character c:sub) {
			 System.out.println(c);
		 }*/
	}

}
