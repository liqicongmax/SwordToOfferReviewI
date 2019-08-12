package niuke;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 13:53
 */
public class 数组中出现超过一半的数字 {
    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     * @param arr
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] arr){
        Arrays.sort(arr);
        int size=arr.length;
        if(arr[size/2]==arr[0]||arr[size/2]==arr[size-1]){
            return arr[size/2];
        }else {
            return 0;
        }
    }
}
