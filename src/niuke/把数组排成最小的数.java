package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 16:37
 */
public class 把数组排成最小的数 {
    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     * @param numbers
     * @return
     */
    public int PrintMinNumber(int[] numbers){
        if(numbers.length==0){
            return 0;
        }
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a=Integer.valueOf(numbers[i]+""+numbers[j]);
                int b=Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    int temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        String result="";
        for(int i:numbers){
            result+=""+i;
        }
        return Integer.valueOf(result);
    }
}
