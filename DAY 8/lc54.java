import java.util.*;
public class lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(top<=bottom && left<=right)
        {
            //left -> right
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            //top -> bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right -> left
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //bottom -> left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }        
        return ans;
    }
}
