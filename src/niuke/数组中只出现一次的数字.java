package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/15 17:05
 */
public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]){
        int combine=0;
        for(int i=0;i<array.length-1;i++){
            combine=(array[i]^(array[i+1]));
        }
        //两个不同值的异或combine
        int index=getFirst1(combine);
        for(int i=0;i<array.length-1;i++){
            if(checkNum(array[i],index)){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }

    public boolean checkNum(int num,int index){
        return ((num>>index)&1)==1;
    }

    public int getFirst1(int num){
        int index=0;
        while(((num&1)==0)&&index<32){
            num=num>>1;
            index++;
        }
        return index;
    }
}
