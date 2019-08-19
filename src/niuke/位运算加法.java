package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 10:45
 */
public class 位运算加法 {
    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int result=n;
        boolean f= n>0&& (result+=Sum_Solution(n-1))>0;
        return result;
    }
}
