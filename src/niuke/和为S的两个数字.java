package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/16 16:22
 */
public class 和为S的两个数字 {
    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * @param array
     * @param sum````
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        ArrayList<Integer> list=new ArrayList<>();
        int start=array[0];
        int end=array[array.length-1];
        if(start>(sum/2)||end<(sum/2)){
            return list;
        }
        start=0;
        end=array.length-1;
        while(start<end){
            if(start+end==sum){
                list.add(start);
                list.add(end);
                return list;
            }else if(start+end<sum){
                start++;
            }else{
                end--;
            }
        }
        return list;
    }
}
