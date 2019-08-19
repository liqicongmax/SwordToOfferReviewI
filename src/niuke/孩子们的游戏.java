package niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 10:30
 */
public class 孩子们的游戏 {
    /**
     * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
     * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
     * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
     * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
     * @param n 小朋友编号从0到n-1
     * @param m 出列的编号数
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1){
            return -1;
        }
        List<Integer> circle=new ArrayList<>();
        for(int i=0;i<n;i++){
            circle.add(i);
        }
        int index=0;
        while(circle.size()!=1){
            index=(index+m-1)%circle.size();
            circle.remove(index);
        }
        return circle.get(0);
    }
}
