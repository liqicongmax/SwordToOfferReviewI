package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 11:03
 */
public class 两个整数之和 {
    public int Add(int a,int b){
        while(a!=0){
            int temp=a^b;
            a=((a&b)<<1);
            b=temp;
        }
        return b;
    }
}
