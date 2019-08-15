package extra;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/13 13:10
 */
public class StaticTest {

    public static void staticFunction(){
        System.out.println("4");
        System.out.println("now"+"b="+b);
    }
    static {
        System.out.println("1");
    }
    static StaticTest st=new StaticTest();

    {
        System.out.println("2");
    }
    StaticTest(){
        System.out.println("3");
        System.out.println("a="+a+"b="+b);
    }

    int a=110;
    static int b=112;
    public static void main(String[] args){
        staticFunction();
    }
}
