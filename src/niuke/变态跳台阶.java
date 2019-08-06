package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 19:45
 */
public class 变态跳台阶 {
    /**
     * 一次可以跳1,2,3...n格台阶,求跳n格有几种跳法
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}
