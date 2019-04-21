package LeetCode;
/*
 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��
 * ����: "cbbd"
 * ���: "bb"
 * 
 * ����: "babad"
 * ���: "bab"
 * ע��: "aba" Ҳ��һ����Ч�𰸡�
 * �ַ�������Ϊ1 �ַ�������Ϊ0 �ַ���Ϊ��
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
