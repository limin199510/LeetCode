package offer;
/*
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class StrReplace {
	public String replaceSpace(StringBuffer str) {
        StringBuffer newStr=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                newStr.append("%20");
            else
                newStr.append(str.charAt(i));
        }
        return newStr.toString();
    	
    }
	public static String replaceSpace2(StringBuffer str) {
		int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }
        int temp=str.length();
        str.setLength(temp+count*2);
        for(int i=temp-1;i>=0;i--) {
        	if(str.charAt(i)==' ') {
        		count--;
        		str.setCharAt(i+count*2, '%');
        		str.setCharAt(i+count*2+1, '2');
        		str.setCharAt(i+count*2+2, '0');
        	}else {;
        		str.setCharAt(i+count*2, str.charAt(i));
        	}
        }
        return str.toString();
    }
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("hello world");
		System.out.println(StrReplace.replaceSpace2(str));
		//System.out.println(str.capacity());
	}
}
