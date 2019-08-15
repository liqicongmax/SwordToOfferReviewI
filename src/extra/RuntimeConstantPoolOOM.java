package extra;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/14 8:30
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args){
        String str1=new StringBuilder("jisuanji").append("ruanjian").toString();
        System.out.println(str1.intern()==str1);
        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);
    }
}
