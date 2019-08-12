package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 14:23
 */
public class 连续子数组的最大和 {
    /**
     * 给个数组,求连续数组的最大和
     * @param array
     * @return
     */
    public int FindGreatestSumOfSubArray(int[] array){
        if(array.length==0){
            return 0;
        }
        int total=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<array.length;i++){
            if(curSum<=0){
                curSum=array[i];
            }else{
                curSum+=array[i];
            }
            if(total<curSum){
                total=curSum;
            }
        }
        return total;
    }
}
