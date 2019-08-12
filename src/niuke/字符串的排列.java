package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 11:07
 */
public class 字符串的排列 {
    /**
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
     * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     * @param str
     * @return
     */
    private ArrayList<String> result=new ArrayList<>();
    public ArrayList<String> Permutation(String str){
        if(str==null||str.trim().equals("")){
            return result;
        }
        //两个问题,怎么获取所有的字符串
        //排序
        char[] arr=str.toCharArray();
        generate(arr,0,result);
        return result;
    }
    public void generate(char[] str,int index,ArrayList<String> result){
        if(index==str.length-1){//索引到最后一个,递归退出
            String temp=String.valueOf(str);
            if(!result.contains(temp)){
                result.add(temp);
            }
            return;
        }
        for(int i=index;i<str.length;i++){
            swap(str,i,index);
            generate(str,index+1,result);
            swap(str,index,i);//这轮循环中,对index都是没有变化的,所以可以正确的将之前换位的重新换回去进行下一轮的换位
        }
    }
    void swap(char[] arr,int x,int y){
        char temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
