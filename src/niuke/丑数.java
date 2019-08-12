package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 17:26
 */
public class 丑数 {
    /**
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     * @param index
     * @return
     */
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        if(index<8){
            return index;
        }
        int i2=0,i3=0,i5=0;
        int m2=2,m3=3,m5=5;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int min=0;
        while(list.size()<index){
            int r2=m2*list.get(i2);
            int r3=m3*list.get(i3);
            int r5=m5*list.get(i5);
            min=Math.min(r2,Math.min(r3,r5));
            list.add(min);
            if(min==r2){
                i2++;
            }
            if(min==r3){
                i3++;
            }
            if(min==r5){
                i5++;
            }
        }
        return min;
    }
}
