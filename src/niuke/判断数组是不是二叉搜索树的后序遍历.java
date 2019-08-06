package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 21:16
 */
public class 判断数组是不是二叉搜索树的后序遍历 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        int size=sequence.length-1;
        int i=0;
        while(size>=0){
            while(sequence[i]<sequence[size]){
                i++;
            }
            while(sequence[i]>sequence[size]){
                i++;
            }
            if(i<size){
                return false;
            }
            i=0;
            size--;
        }

        return true;
    }
    public static void main(String[] args){
        int[] arr={4,6,7,5};
        VerifySquenceOfBST(arr);
    }
}
