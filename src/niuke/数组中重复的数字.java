package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 13:27
 */
public class 数组中重复的数字 {
    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
     * 请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     * @param numbers 数组
     * @param length 数组长度
     * @param duplication duplication[0]存放第一个重复的数字
     * @return
     */
    public boolean duplicate(int[] numbers,int length,int [] duplication) {
        int[] temp=new int[length];
        for(int i=0;i<length;i++){
            if(temp[numbers[i]]==1){
                duplication[0]=numbers[i];
                return true;
            }
            temp[numbers[i]]++;

        }
        return false;
    }
}
