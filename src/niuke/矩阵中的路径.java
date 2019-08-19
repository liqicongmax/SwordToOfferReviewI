package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 17:04
 */
public class 矩阵中的路径 {
    /**
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
     * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
     * 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bccced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
     * @param matrix
     * @param rows
     * @param cols
     * @param str
     * @return
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] checked=new boolean[rows*cols];
        for(int x=0;x<cols;x++){
            for(int y=0;y<rows;y++){
                if(include(matrix,rows,cols,str,x,y,0,checked)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean include(char[] matrix,int rows,int cols,char[] str,int i, int j,int k,boolean[] checked){
        if(i<0||i>=cols||j<0||j>=rows||checked[i+j*cols]||str[k]!=matrix[i+j*cols]){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        checked[i+j*cols]=true;
        if(include(matrix, rows, cols, str, i, j+1, k+1, checked)||
                include(matrix, rows, cols, str, i, j-1, k+1, checked)||
                include(matrix, rows, cols, str, i+1, j, k+1, checked)||
                include(matrix, rows, cols, str, i-1, j, k+1, checked)){
            return true;
        }
        checked[i+j*cols]=false;
        return false;
    }
}
