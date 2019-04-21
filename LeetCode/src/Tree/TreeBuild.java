package Tree;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){
		
	}
	TreeNode(int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
}
public class TreeBuild {
	public static void preorderPrint(TreeNode head,int layer){
		if(head==null)
			return;
		for(int i=0;i<layer;i++)
			System.out.print("---");
		System.out.println(head.val);
		preorderPrint(head.left,layer+1);
		preorderPrint(head.right,layer+1);
		
	}
	public static void midPrint(TreeNode head,int layer){
		if(head==null)
			return;
		midPrint(head.left,layer+1);
		for(int i=0;i<layer;i++)
			System.out.print("---");
		System.out.println(head.val);
		midPrint(head.right,layer+1);
		
	}
	public static void afterPrint(TreeNode head,int layer){
		if(head==null)
			return;
		afterPrint(head.left,layer+1);
		afterPrint(head.right,layer+1);
		for(int i=0;i<layer;i++)
			System.out.print("---");
		System.out.println(head.val);
		
		
	}
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		t1.left=t2;
		t1.right =t3;
		t2.left=t4;
		afterPrint(t1,0);
		
	}

}
