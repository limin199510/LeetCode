package Tree;

import java.util.List;
import java.util.Stack;

/*
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
 * 最近公共祖先表示为一个结点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]


 */
public class TreeCommonAncestor {
	
	public void preorderPrint(TreeNode o,TreeNode head,TreeNode search,Stack<TreeNode> stack){
		if(head==null||o.val==1) {
			return;
		}	
		stack.push(head);
		if(head==search) {
			o.val=1;
		    return;
		}
		preorderPrint(o,head.left,search,stack);
		preorderPrint(o,head.right,search,stack);
		if(o.val!=1)
			stack.pop();
	}
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {   
		 TreeNode t=new TreeNode();
		 Stack<TreeNode> li1=new Stack<>();
	     preorderPrint(new TreeNode(0),root,p,li1);
	     Stack<TreeNode> li2=new Stack<>();
	     preorderPrint(new TreeNode(0),root,q,li2);
	     int len=Math.min(li1.size(), li2.size());
	     for(int i=0;i<len;i++) {
	    	 if(li1.get(i)==li2.get(i))
	    		 t=li1.get(i);
	     }
	     return t;
	 }
	 public static void main(String[] args) {
		 TreeNode t1=new TreeNode(5);
			TreeNode t2=new TreeNode(4);
			TreeNode t3=new TreeNode(8);
			TreeNode t4=new TreeNode(15);
			TreeNode t5=new TreeNode(13);
			TreeNode t6=new TreeNode(4);
			TreeNode t7=new TreeNode(7);
			TreeNode t8=new TreeNode(2);
			TreeNode t9=new TreeNode(5);
			TreeNode t10=new TreeNode(1);
			t1.left=t2;
			t1.right=t3;
			t2.left=t4;
			t3.left=t5;
			t3.right=t6;
			t4.left=t7;
			t4.right=t8;
			t6.left=t9;
			t6.right=t10;
			TreeNode t=new TreeCommonAncestor().lowestCommonAncestor(t1, t5, t9);
			if(t!=null)
				System.out.println(t.val);
	}

}
