package niuke;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 19:53
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int [] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]%2==1&&arr[j-1]%2==0){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
