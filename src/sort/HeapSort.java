package sort;

import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/13 10:06
 */
public class HeapSort {
    /**
     * 大顶堆
     */
    private void maxAdjust(int[] arr, int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childrenIndex = parentIndex * 2 + 1;
        while (childrenIndex < length) {
            if (childrenIndex + 1 < length && arr[childrenIndex + 1] > arr[childrenIndex]) {
                childrenIndex++;
            }
            if (temp >= arr[childrenIndex]) {
                break;
            }
            arr[parentIndex]=arr[childrenIndex];
            parentIndex=childrenIndex;//下一轮循环现在的子节点就是下一轮的头结点
            childrenIndex=childrenIndex*2+1;
        }
        arr[parentIndex]=temp;
    }

    public void maxHeapSort(int[] arr){
        for(int i=(arr.length-2)/2;i>=0;i--){//构建二叉堆,实际上还是数组形式,构造成根节点和必然大于他们的叶节点的形式
            maxAdjust(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxAdjust(arr,0,i);//0位置上的根节点必然是当前堆中最大的值,所以放到末尾,然后对数组长度-1的数组进行重新构建堆,生成一个新的大顶堆,继续下一轮的排序
        }
    }

    public static void main(String[] args){
        int[] arr={3,4,1,2,5};
        new HeapSort().maxHeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
