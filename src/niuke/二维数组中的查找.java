package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 15:44
 */
public class 二维数组中的查找 {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public static boolean findInt(int target,int[][] arr){
        boolean flag=false;
        if(arr.length==0||arr[0].length==0){
            return false;
        }
        int x=0;
        int y=0;
        int hang=arr.length;//每列有的个数
        int lie=arr[0].length;//每行有的个数
        for(int i=0;i<lie;i++){
            if(target==arr[0][i]){
                return true;
            } else if (target>arr[0][i]){
                x=i;
            } else{
                break;
            }
        }
        for(int i=0;i<hang;i++){
            if(target==arr[i][0]){
                return true;
            }else if(target>arr[i][0]){
                y=i;
            }else {
                break;
            }
        }
        for(int i=0;i<=y;i++){
            for(int j=0;j<=x;j++){
                if(target==arr[i][j]){
                    flag=true;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args){
        int[][] arr=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findInt(7,arr));
    }
}
