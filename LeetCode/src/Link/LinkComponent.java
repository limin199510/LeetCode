package Link;
/*
 * ����һ���������������һ������ֵ����ͷ��� head��
 * ͬʱ�����б� G�����б�����������������ֵ��һ���Ӽ���
 * �����б� G ������ĸ�����
 * ���������Ķ���Ϊ��
 * ������һ�����������ֵ����ֵ�������б� G �У����ɵļ��ϡ�
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
