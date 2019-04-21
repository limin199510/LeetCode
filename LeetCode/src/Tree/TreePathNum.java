package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 * 给定如下二叉树，以及目标和 sum = 22，
 *            5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class TreePathNum {
	public void preorderPrint(TreeNode head,int sum,int pathSum,List<List<Integer>> result,Stack<Integer> stack){
		if(head==null)
			return;
		pathSum+=head.val;
		stack.push(head.val);
		if(head.left==null&&head.right==null&&pathSum==sum) {
			List<Integer> li=new ArrayList<>();
			for(int i=0;i<stack.size();i++) {
				li.add(stack.get(i));
			}
			result.add(li);
		}
		preorderPrint(head.left,sum,pathSum,result,stack);
		preorderPrint(head.right,sum,pathSum,result,stack);
		pathSum-=head.val;
		stack.pop();
	}
	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
		 List<List<Integer>> result=new ArrayList<>();
		 int pathSum=0;
		 Stack<Integer> stack=new Stack<>();
		 preorderPrint(root, sum, pathSum, result, stack);
		 return result;
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
		List<List<Integer>> result=new TreePathNum().pathSum(t1, 22);
		for(int i=0;i<result.size();i++)
			 System.out.println(result.get(i));
	}

}
