package StackAndQueue;

import java.util.Stack;

/*
 * 实现一个基本的计算器来计算一个简单的字符串表达式的值。
 * 字符串表达式可以包含左括号 ( ，右括号 )，加号 + ，减号 -，非负整数和空格  。
 * 示例 1:
 * 输入: "1 + 1"
 * 输出: 2
 * 示例 2:
 * 输入: " 2-1 + 2 "
 * 输出: 3
 * 示例 3:
 * 输入: "(1+(4+5+2)-3)+(6+8)"
 * 输出: 23
 */
public class CalculateMachine {
	
	
	/*public String transform(String s) {
		Stack<String> stack=new Stack<>();
		String str="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push("(");
			}else if(s.charAt(i)=='+') {
				if(!stack.isEmpty()&&stack.peek()=="==") {
					str+=stack.pop();
				}
				stack.push("+");
			}
			else if(s.charAt(i)=='-') {
				if(!stack.isEmpty()&&stack.peek()=="-") {
					str+=stack.pop();
				}
				stack.push("-");
			}else if(s.charAt(i)==' ') {
				count++;
				continue;
			}
			else if(s.charAt(i)==')') {
				while(stack.peek()!="(") {
					str+=stack.pop();
				}
				stack.pop();
			}else {
				count++;
				str+=s.charAt(i);
			}	
		}
		while(!stack.isEmpty())
			str+=stack.pop();
		if(count==s.length())
			str=null;
		return str;
	}
	public int calculate(String s) {
		//将s转换为后缀表达式
		Stack<Integer> cal=new Stack<>();
		String str=transform(s);
		if(str==null)
			return Integer.parseInt(s.trim());
		if(!str.contains("-")) {
			if(!str.contains("+"))
				return Integer.parseInt(str);
		}
		
		int num=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='+') {
				num=cal.pop()+cal.pop();
				cal.push(num);
			}else if(str.charAt(i)=='-') {
				int num1=cal.pop();
				System.out.println(num1);
				int num2=cal.pop();
				System.out.println(num2);
				num=num2-num1;
				cal.push(num);
			}else {
				cal.push(Integer.parseInt(String.valueOf(str.charAt(i))));
			}
		}
			
        return num;
    }*/
	public int calculate(String s) {
		Stack<Integer> data=new Stack<>();
		Stack<Character> ch=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				ch.push('(');
			}else if(s.charAt(i)=='+') {
				if(!ch.isEmpty()&&ch.peek()=='-') {
					ch.pop();
					int num1=data.pop();
					int num2=data.pop();
					int num=num2-num1;
					data.push(num);
				}
				ch.push('+');
			}else if(s.charAt(i)=='-') {
				if(!ch.isEmpty()&&ch.peek()=='-') {
					ch.pop();
					int num1=data.pop();
					int num2=data.pop();
					int num=num2-num1;
					data.push(num);
				}
				ch.push('-');
			}else if(s.charAt(i)==' ') {
				continue;
			}else if(s.charAt(i)==')') {
				
				if(ch.size()==1&&ch.peek()=='(')
					continue;
				else {
					while(ch.peek()!='(') {
						int num1=data.pop();
						int num2=data.pop();
						int num=0;
						char c=ch.pop();
						if(c=='+') {
							num=num1+num2;
						}else if(c=='-') {
							num=num2-num1;
						}
						data.push(num);
					}
					ch.pop();
				}
			}else {
				int index=i;
				i++;
				while(i<s.length()&&s.charAt(i)!='('&&s.charAt(i)!='+'&&s.charAt(i)!='-'
						&&s.charAt(i)!=')'&&s.charAt(i)!=' ') {
					i++;
				}
				data.push(Integer.parseInt(s.substring(index,i)));
				i--;
			}	
		}
		while(!ch.isEmpty()&&ch.peek()!='(') {
			int num1=data.pop();
			int num2=data.pop();
			int num=0;
			char c=ch.pop();
			if(c=='+')
				num=num1+num2;
			else if(c=='-')
				num=num2-num1;
			data.push(num);
		}
		while(!data.isEmpty())
			return data.pop();
        return 0;
    }
	public static void main(String[] args) {
		String s="1-(5)";
		System.out.println(new CalculateMachine().calculate(s));
	}

}
