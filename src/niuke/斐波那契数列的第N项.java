package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 19:30
 */
public class 斐波那契数列的第N项 {
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-2)+Fibonacci(n-1);
    }
    public static void main(String[] args){
        System.out.println(Fibonacci(3));
    }
}
