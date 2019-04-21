package Link;
/*
 * 给定一个链表（链表结点包含一个整型值）的头结点 head。
 * 同时给定列表 G，该列表是上述链表中整型值的一个子集。
 * 返回列表 G 中组件的个数，
 * 这里对组件的定义为：
 * 链表中一段最长连续结点的值（该值必须在列表 G 中）构成的集合。
 */
class BigClass{	
}
class Singleton{
	private BigClass bc;
	private static Singleton instance=new Singleton(new BigClass());
	private Singleton(BigClass bc) {this.bc=bc;}
	public Singleton getInstance() {
		return instance;
	}
}
public class LinkComponent {
	public static void main(String[] args) {
		assert 1+1==2;
		System.out.println("assert1 ok");
		assert 1+1==3: "assert failed,exit";
		System.out.println("assert2 ok");
	
	}
}
