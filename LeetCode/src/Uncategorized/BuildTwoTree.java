package offer;

import java.util.HashMap;
import java.util.Map;

/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
class TreeNode{
	int data;
	TreeNode left=null;
	TreeNode right=null;
	TreeNode(int data){
		this.data=data;
	}
}
public class BuildTwoTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre==null||in==null)
			return null;
		Map<Integer,Integer> inMap=new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++) {
			inMap.put(in[i], i);
		}
		return preIn(inMap,pre,0,pre.length-1,in,0,in.length-1);
    }
	public TreeNode preIn(Map<Integer,Integer> inMap,int []pre,int pi,int pj,int []in,int ii,int ij) {
		if(pi>pj)
			return null;
		TreeNode root=new TreeNode(pre[pi]);
		int index=inMap.get(pre[pi]);
		root.left=preIn(inMap,pre,pi+1,pi+index-ii,in,ii,index-1);
		root.right=preIn(inMap,pre,pi+index-ii+1,pj,in,index+1,ij);
		return root;
	}
}
