package sort;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 19:06
 */
public class MergeSort {
    /**
     * 写个归并排序!
     */
    public void sort(int[] arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=start+((end-start)>>1);
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public void merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=0;
        int p1=start;
        int p2=mid+1;
        while(p1<=mid&&p2<=end){
            temp[i++]=arr[p1]>arr[p2]?arr[p2++]:arr[p1++];
        }
        while(p1<=mid){
            temp[i++]=arr[p1++];
        }
        while(p2<=end){
            temp[i++]=arr[p2++];
        }
        for(int j=0;j<temp.length;j++){
            arr[start+j]=temp[j];
        }
    }
    public void mergeSort(int[] arr){
        sort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }
    public static void main(String[] args){
        int[] arr={2,5,4,1,6,3,9,7,8};
        new MergeSort().mergeSort(arr);
    }
}
