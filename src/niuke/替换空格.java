package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 16:45
 */
public class 替换空格 {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }
}
