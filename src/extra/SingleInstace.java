package extra;

import sun.security.jca.GetInstance;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/7 8:35
 */
public class SingleInstace {
    private static final AtomicReference<SingleInstace> instance=new AtomicReference<>();
    private SingleInstace(){}
    public SingleInstace getInstance() {
        for(;;) {
            if(instance.get()==null){
                SingleInstace singleInstace=new SingleInstace();
                instance.compareAndSet(null,singleInstace);
            }
            return instance.get();
        }
    }
    public static void main(String[] args){
        SingleInstace s1=new SingleInstace().getInstance();
        SingleInstace s2=new SingleInstace().getInstance();
        System.out.println(s1==s2);
    }
}
