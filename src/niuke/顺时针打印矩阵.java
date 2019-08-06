package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:30
 */
public class 顺时针打印矩阵 {
    public ArrayList<Integer> printMatrix(int [][] matrix){
        ArrayList<Integer> list=new ArrayList<>();
        if(matrix.length==0){
            return list;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int rowStart=0;
        int colStart=0;
        int rowEnd=row-1;
        int colEnd=col-1;
        while(rowStart<=rowEnd&&colStart<=colEnd){
            if(rowStart==rowEnd){
                for(int i=colStart;i<=colEnd;i++){
                    list.add(matrix[rowStart][i]);

                }
                return list;
            }
            if(colStart==colEnd){
                for(int i=rowStart;i<=rowEnd;i++){
                    list.add(matrix[i][colStart]);
                }
                return list;
            }
            for(int i=colStart;i<=colEnd;i++){
                list.add(matrix[rowStart][i]);
            }
            for(int i=rowStart+1;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            for(int i=colEnd-1;i>=colStart;i--){
                list.add(matrix[rowEnd][i]);
            }
            for(int i=rowEnd-1;i>=rowStart+1;i--){
                list.add(matrix[i][colStart]);
            }
            colStart++;
            colEnd--;
            ++rowStart;
            --rowEnd;
        }
        return list;
    }
}
