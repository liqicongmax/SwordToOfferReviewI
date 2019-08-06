package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 19:06
 */
public class 旋转数组的最小值 {
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int start=0;
        int end=array.length-1;
        int middle=0;
        while(array[start]>=array[end]){
            if((end-start)==1){
                middle=end;
                break;
            }
            middle=start+(end-start)>>1;
            if(array[start]<=array[middle]){
                start=middle;
            }
            if (array[end] >= array[middle]){
                end=middle;
            }
        }
        return array[middle];
    }
}
