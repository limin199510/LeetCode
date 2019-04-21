package Greedy;

import java.util.PriorityQueue;

/*
 * 汽车从起点出发驶向目的地，该目的地位于出发位置东面 target 英里处。
 * 沿途有加油站，每个 station[i] 代表一个加油站，它位于出发位置东面 station[i][0] 英里处，并且有 station[i][1] 升汽油。
 * 假设汽车油箱的容量是无限的，其中最初有 startFuel 升燃料。它每行驶 1 英里就会用掉 1 升汽油。
 * 当汽车到达加油站时，它可能停下来加油，将所有汽油从加油站转移到汽车中。
 * 为了到达目的地，汽车所必要的最低加油次数是多少？如果无法到达目的地，则返回 -1 。
 * 注意：如果汽车到达加油站时剩余燃料为 0，它仍然可以在那里加油。
 * 如果汽车到达目的地时剩余燃料为 0，仍然认为它已经到达目的地。
 */
public class MinRefuelCount {
	//当不能再走时选择加油
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
		PriorityQueue<Integer> big=new PriorityQueue<>((a1, a2) -> a2 - a1);
		if(startFuel>=target)
			return 0;
		if(stations==null||stations.length<1||startFuel<stations[0][0])
			return -1;
		int count=0;
		int p=startFuel-stations[0][0];//到达第一个加油站后的剩余汽油量
		big.offer(stations[0][1]);//将第一个加油站的汽油量添加进最大堆
		for(int i=1;i<=stations.length;i++) {//判断是否能够到达第i个加油站
			int d;
			if(i==stations.length)
				d=target-stations[stations.length-1][0];
			else
				d=stations[i][0]-stations[i-1][0];//第i个加油站和第i-1个加油站之间的距离
			while(p<d&&!big.isEmpty()) {
				p+=big.poll();//当前汽油量无法到达第i个加油站 需要加油,并且选择油量最多的加油站
				count++;
			}
			if(p>=d) {//当前汽油量足够到达加油站i
				if(i==stations.length)
					return count;
				big.offer(stations[i][1]);
				p=p-d;
			}else {//经过加油之后还是无法到达加油站i说明无法到达终点
				return -1;
			}
		}
		return count;
    }
}
