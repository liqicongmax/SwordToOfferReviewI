package sort;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/13 9:50
 */
public class QuickSort {
    private int partition(int[] arr,int start,int end){
        int temp=arr[start];
        while(start<end){
            while(start<end&&arr[end]>temp){
                end--;
            }
            arr[start]=arr[end];
            while(start<end&&arr[start]<temp){
                start++;
            }
            arr[end]=arr[start];
        }
        arr[start]=temp;
        return start;
    }
    private void quickSort(int[] arr,int start,int end){
        if(start<end) {
            int partition = partition(arr, start, arr.length - 1);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }
    public static void main(String[] args){
        int[] arr={3,1,4,2,5};
        new QuickSort().quickSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
