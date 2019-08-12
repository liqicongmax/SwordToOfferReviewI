package niuke;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 13:59
 */
public class 最小的K个数 {
    /**
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(k>input.length||k==0){
            return result;
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<input.length;i++){
            if(maxHeap.size()<k){
                maxHeap.add(input[i]);
            }
            if(input[i]<maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(input[i]);
            }
        }
        result.addAll(maxHeap);
        return result;
    }
}
