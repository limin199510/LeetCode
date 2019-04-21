package No16March;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatternMatch {
	public int search(String str,String q) {
		int index=-1;
		for(int i=0,temp=0;i<str.length();i++) {
			int j=0;
			while(j<q.length()) {
				if(str.charAt(temp)==q.charAt(j)) {
					temp++;
					j++;
				}else {
					temp=i+1;
					break;
				}
			}
			if(j==q.length()) 
				return i;
		}
		return index;
	}
	/*
	 * next[j]=-1 j=0;
	 * next[j]=0 j前面没有相似的前缀和后缀时
	 */
	public int []next(String q){
		int []pos=new int[q.length()];
		pos[0]=-1;//表示前面没有字符
		int i=0;
		int j=-1;
		while(i<q.length()-1) {
			if(j==-1||q.charAt(i)==q.charAt(j)) {
				i++;
				j++;
				pos[i]=j;
			}else {
				j=pos[j];
			}
		}
		return pos;
	}
	public int kmpSearch(String str,String q) {
		int index=-1;
		Set<Integer> h=new HashSet<>();
		return index;
		
	}
	//请你找出其中不含有重复字符的 最长子串 的长度。
	public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int ans=0;
        for(int j=0,i=0;j<s.length();j++) {
        	if(map.containsKey(s.charAt(j))) 
        		i=Math.max(map.get(s.charAt(j)), i);
        	ans=Math.max(ans, j-i+1);
        	map.put(s.charAt(j), j+1);
        }
        return ans;
        
    }
	public static void main(String[] args) {
		String str="abcdxgfabd",q="abfabaa";
		PatternMatch pm=new PatternMatch();
		int []pos=pm.next(q);
		for(int i=0;i<pos.length;i++)
			System.out.println(pos[i]);
		//System.out.println(pm.search(str, q));
	}
//(n-m+1)m
}
