package Link;
/*
 * ��������ʵ�֡�������ѡ��ʹ�õ������˫����
 * �������еĽڵ�Ӧ�þ����������ԣ�val �� next��
 * val �ǵ�ǰ�ڵ��ֵ��next ��ָ����һ���ڵ��ָ��/���á�
 * ���Ҫʹ��˫����������Ҫһ������ prev ��ָʾ�����е���һ���ڵ㡣
 * ���������е����нڵ㶼�� 0-index �ġ�
 * ����������ʵ����Щ���ܣ�
 * get(index)����ȡ�����е� index ���ڵ��ֵ�����������Ч���򷵻�-1��
 * addAtHead(val)��������ĵ�һ��Ԫ��֮ǰ���һ��ֵΪ val �Ľڵ㡣������½ڵ㽫��Ϊ����ĵ�һ���ڵ㡣
 * addAtTail(val)����ֵΪ val �Ľڵ�׷�ӵ���������һ��Ԫ�ء�
 * addAtIndex(index,val)���������еĵ� index ���ڵ�֮ǰ���ֵΪ val  �Ľڵ㡣��� index ��������ĳ��ȣ���ýڵ㽫���ӵ������ĩβ����� index ���������ȣ��򲻻����ڵ㡣
 * deleteAtIndex(index)��������� index ��Ч����ɾ�������еĵ� index ���ڵ㡣
	ʾ����
	MyLinkedList linkedList = new MyLinkedList();
	linkedList.addAtHead(1);
	linkedList.addAtTail(3);
	linkedList.addAtIndex(1,2);   //�����Ϊ1-> 2-> 3
	linkedList.get(1);            //����2
	linkedList.deleteAtIndex(1);  //����������1-> 3
	linkedList.get(1);            //����3

	��ʾ��
	
	����ֵ���� [1, 1000] ֮�ڡ�
	������������  [1, 1000] ֮�ڡ�
	�벻Ҫʹ�����õ� LinkedList �⡣
*/ 
public class LinkDesign {
	public static void main(String[] args) {
	//��MyLinkedList����
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */