package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/13 11:05
 */
public class 数字在排序数组中出现的次数 {
    public int GetNumberOfK(int [] array , int k) {
        int index=findIndex(array,k);
        if(array.length==0||index==-1){
            return 0;
        }

        return findIndex(array,k+0.5f)-findIndex(array,k-0.5f);
    }

    private int findIndex(int[] arr,float target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)>>1);
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,4,5};
        System.out.println(new 数字在排序数组中出现的次数().GetNumberOfK(arr,2));
    }
}
