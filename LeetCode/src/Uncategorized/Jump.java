package offer;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Jump {
	public int JumpFloor(int target) {
        int pre=2,prePre=1;
        int step=0,count=3;
        if(target==1)
        	return 1;
        if(target==2)
        	return 2;
        while(count<=target) {
        	step=pre+prePre;
        	prePre=pre;
        	pre=step;
        	count++;
        }
        return step;  
    }
	public static void main(String[] args) {
		
	}

}
