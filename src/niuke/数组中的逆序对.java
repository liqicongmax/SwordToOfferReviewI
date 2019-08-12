package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/12 19:18
 */
public class 数组中的逆序对 {
    private int count=0;
    public int InversePairs(int [] arr){
        sort(arr,0,arr.length-1);
        return count;
    }
    private void sort(int[] arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=start+((end-start)>>1);
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    private void merge(int[] arr,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=0;
        int p1=start;
        int p2=mid+1;
        while(p1<=mid&&p2<=end){
            if(arr[p1]>arr[p2]){
                temp[i++]=arr[p2++];
                count+=mid-p1+1;
                count=count>1000000007?count%1000000007:count;
            }else{
                temp[i++]=arr[p1++];
            }
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
    public static void main(String[] args){
        int[] arr={2,4,1,3};
        System.out.println(new 数组中的逆序对().InversePairs(arr));
    }
}
