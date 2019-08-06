package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 19:39
 */
public class 跳台阶 {
    /**
     * 青蛙以此条一格或者两格,跳N格共有几种跳法
     */
    public int JumpFloor(int target) {
        if(target<0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return JumpFloor(target-2)+JumpFloor(target-1);
    }
}
