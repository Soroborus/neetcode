public class Main {
    public static void main(String[] args){
        int[][] array={{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(array));
    }
    public static int minFallingPathSum(int[][] matrix) {
        for (int i=1;i<matrix.length;i++){
            matrix[i][0]+= Math.min(matrix[i-1][0],matrix[i-1][1]);
            matrix[i][matrix.length-1]+= Math.min(matrix[i-1][matrix.length-2],matrix[i-1][matrix.length-1]);
            for (int j=1;j<matrix.length-1;j++){
                matrix[i][j]+=min(matrix[i-1][j-1],matrix[i-1][j],matrix[i-1][j+1]);
            }

        }
        return min(matrix[matrix.length-1]);
    }
    public static int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
    public static int min(int[]a){
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        return min;
    }

}
