package offer;
/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class MatrixCover {
	 public int RectCover(int target) {
	        int pre=2,preP=1;
	        if(target==1)
	            return 1;
	        if(target==2)
	            return 2;
	        int count=3,result=0;
	        while(count<=target){
	            count++;
	            result=pre+preP;
	            preP=pre;
	            pre=result;
	        }
	        return result;
	    }

}
