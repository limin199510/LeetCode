package Tree;
/*
 *  二叉树展开为链表
 */
public class TreeLink {
	public void flatten(TreeNode root) {
		if(root==null)
			return;
		if(root.left==null&&root.right==null) {//叶子结点
			return;
		}
		if(root.left!=null&&root.right!=null) {
			flatten(root.left);
			flatten(root.right);
			TreeNode tmp=root.right;
			root.right=root.left;
			TreeNode p=root.right;
			while(p.right!=null) {
				p=p.right;
			}
			p.right=tmp;
			root.left=null;
		}
		if(root.left!=null&&root.right==null) {
			root.right=root.left;
			root.left=null;
		}
		if(root.left==null&&root.right!=null) {
			flatten(root.right);
			return;
		}
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
		new TreeLink().flatten(t1);
		while(t1.right!=null) {
			System.out.println(t1.right.val);
			t1=t1.right;
		}
	}
}
