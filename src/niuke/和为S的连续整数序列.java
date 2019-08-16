package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/16 9:19
 */
public class 和为S的连续整数序列 {
    /**
     * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
     * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
     * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
     * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
     *
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(sum<3){
            return result;
        }
        int start=1,end=2;
        while(start<end&&end<=(sum/2+1)){
            int len=end-start+1;
            int total=(start+end)*len/2;
            if(total>sum){
                start++;
            }else if(total<sum){
                end++;
            }else {
                for(int i=start;i<=end;i++){
                    temp.add(i);
                }
                result.add(temp);
                start++;
            }
            temp=new ArrayList<>();
        }
        return result;
    }
}
