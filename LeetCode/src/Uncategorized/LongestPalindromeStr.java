package LeetCode;
/*
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 输入: "cbbd"
 * 输出: "bb"
 * 
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 字符串长度为1 字符串长度为0 字符串为空
 */
public class LongestPalindromeStr {
	private static int maxLen=0;
	private static String sub="";
	public String longestPalindrome(String s) {
		if(s.length()<=1) {
			return s;
		}
		for(int i=0;i<s.length();i++) {
			find(i-1,i+1,s);
			find(i,i+1,s);
		}
		return sub;
	}
	public void find(int low,int high,String s) {
		while(low>=0&&high<s.length()) {
			if(s.charAt(low)==s.charAt(high)) {
				if(high-low+1>maxLen) {
					maxLen=high-low+1;
					sub=s.substring(low, high+1);
				}
				low--;high++;
			}else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		String str="abcdedcbafh";
		System.out.println(new LongestPalindromeStr().longestPalindrome(str));
	}
}
